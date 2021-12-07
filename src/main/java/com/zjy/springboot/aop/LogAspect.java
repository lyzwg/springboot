package com.zjy.springboot.aop;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zjy.springboot.mapper.TLogMapper;
import com.zjy.springboot.pojo.TLog;
import com.zjy.springboot.pojo.TUser;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
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
