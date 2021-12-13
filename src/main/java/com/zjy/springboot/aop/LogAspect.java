package com.zjy.springboot.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjy.springboot.mapper.TLogMapper;
import com.zjy.springboot.pojo.TLog;
import com.zjy.springboot.pojo.TUser;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/9 11:18
 * @Description:
 */
@Component
@Aspect//切面注解
@Slf4j
public class LogAspect {

    @Autowired
    private TLogMapper logMapper;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Pointcut("execution(* com.zjy.springboot.controller.*.*(..))")
    public void pointcut(){

    }
    @Pointcut("execution(* com.zjy.springboot.controller.*.*(..))")
    public void transform(){

    }
    @SneakyThrows
    @Around("transform()")
    public Object BeforeTransform(ProceedingJoinPoint pjp){
        //重点 这里就是获取@RequestBody参数的关键  调试的情况下 可以看到arr变量已经获取到了请求的参数
        Object[] arr = pjp.getArgs();
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] instanceof HttpServletRequest) { // 特殊处理
                HttpServletRequest request = (HttpServletRequest) arr[i];
                Map<String, String[]> m = request.getParameterMap();
                Map<String, String[]> newM = new HashMap<>();
                if (m != null) {
                    for (Map.Entry<String, String[]> entry : m.entrySet()) {
                        String key = entry.getKey();
                        String[] value = entry.getValue();
                        if (value == null) continue;
                        for (int j = 0; j < value.length; ++j) {
                            String temp = value[i].trim();
                            value[i] = temp.length() == 0 ? null : temp;
                        }
                        newM.put(key, value);
                    }
                }
                // 因为我们无法去改变getParameterMap的返回值
                // 所以对里面的值去除空格是无效的
                // 但是我们可以把参数的值去除空格之后把值放入setAttribute里面
                // 这样request对象就携带了去除空格之后的值
                request.setAttribute("The-result-after-removing-the-space", newM);
                arr[i] = request;
            } else {
                // 考虑到类里面还有类 这里采用递归的方式处理
                if (null != arr[i])
                    arr[i] = dfs(arr[i].getClass(), arr[i]);
            }
        }

        // 把 arr 放回去即可改变参数的值
        return pjp.proceed(arr);
    }
    private Object dfs(Class<?> aClass, Object object) throws IllegalAccessException {
        if (object == null) return null;
        // 判断是否为Java的基本类型或包装类
        if (isPrimitive(aClass)) {
            if (object instanceof String) {
                return ((String) object).trim();
/*                String str = (String) object;
                // 将json字符串转换为json对象
                JSONObject jsonObject = JSONObject.parseObject(str);
                // 把json对象转换为Map集合
                Map<String, Object> map = JSON.toJavaObject(jsonObject, Map.class);
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    String trim = entry.getValue().toString().trim();
                    map.put(entry.getKey(), trim);
                }
                return JSONUtils.toJSONString(map);*/
            }else if (object instanceof List<?>) {
                //List中是字符串的话需要特殊处理，如果是对象List的话递归
                List<Object> result = new ArrayList<>();
                for (Object o : (List<?>) object) {
                    if (isPrimitive(o.getClass())) {
                        if (o instanceof String) {
                            o = ((String) o).trim();
                            result.add(o);
                        } else if (isPrimitive(o.getClass())) {
                            result.add(o);
                        }
                    } else {
                        result.add(dfs(o.getClass(), o));
                    }
                }
                return result;
            }
            return object;
        }
        // 返回类所有字段
        // 注意： 会返回静态字段
        // 不要在Dto、Vo定义静态属性
        // 没有获取父类属性 可通过 “object.getClass().getSuperclass()” 获取
        for (Field item : object.getClass().getDeclaredFields()) {
            // static 和 final 修饰的字段忽略
            if (Modifier.isStatic(item.getModifiers()) || Modifier.isFinal(item.getModifiers())) {
                continue;
            }
            // 设置可见性
            item.setAccessible(true);
            // 递归处理
            item.set(object, dfs(item.getType(), item.get(object)));
        }
        return object;
    }

    // 判断是否为Java的基本类型或包装类
    // java.lang.* java.util.* 存放着Java的基本数据类型的包装类和集合类
    // 基本数据类型和包装类是JVM虚拟机运行需要的类，已嵌入到JVM内核
    // 不需要继承ClassLoader 用户自定义的需要
    private boolean isPrimitive(Class<?> aClass) {
        return aClass != null && aClass.getClassLoader() == null;
    }
    @Before("pointcut()")
    public void logBefore(JoinPoint joinPoint){
        TLog tLog =new TLog();
        //获取需要记录的日志信息 requestContextHolder
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //获取请求地址
        String requestURI = request.getRequestURI();
        tLog.setRequesturl(requestURI);
        //获取请求ip
        String ip = request.getRemoteAddr();
        tLog.setIp(ip);
        //获取请求数据将所有的请求数据封装到map中
        Map<String, String[]> map = request.getParameterMap();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String json = objectMapper.writeValueAsString(map);
            log.info("data:{}",json);
            tLog.setData(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        TUser user = (TUser) request.getSession().getAttribute("user");
        if (user!=null){
            Long userId = user.getId();
            tLog.setUserid(userId);
        }
        else {
            tLog.setUserid(-1L);
        }
        //插入数据库 进行异步处理
        logMapper.insert(tLog);
        //发送消息到mq
//        rabbitTemplate.convertAndSend();

    }
}
