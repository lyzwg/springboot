package com.zjy.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.zjy.springboot.mapper.UserMapper;
import com.zjy.springboot.pojo.TUser;
import com.zjy.springboot.service.UserService;
import lombok.SneakyThrows;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.AmqpException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/2 14:23
 * @Description:
 */
@Controller
public class UserController {
    //定义日志对象
    private static final Logger log= LoggerFactory.getLogger(UserController.class);
    @Resource
    private UserMapper userMapper;
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RedissonClient redissonClient;

    @RequestMapping("/userList")
    public String selectAll(ModelMap map){
        //先判断数据库中是否有缓存
        List<TUser> userList = (List<TUser>) redisTemplate.opsForValue().get("userList");
        if (userList ==null){
            log.info("缓存不存在 执行数据库查询 selectAll");
            userList = userMapper.selectAll();
            //将查询到的数据放入redis缓存 并设置超时时间
            redisTemplate.opsForValue().set("userList",userList,60, TimeUnit.SECONDS);
        }else{
            log.info("缓存存在，走缓存");
        }
        map.put("userList",userList);
        return "userList.html";
    }
    @RequestMapping("/user/login")
    public String login(String username, String password,String code, HttpSession session){
        ModelAndView mv = new ModelAndView();
        String oldCode = redisTemplate.opsForValue().get("code:" + username)+"";
        if (oldCode==null||!oldCode.equals(code)){
            log.info("验证码错误!");
            return "login.html";
        }
        TUser tUser = userMapper.selectByName(username);
        if (tUser==null||!password.equals(tUser.getPassword())){
            //日志的级别： debugger调试 info信息 warn警告 error错误级别
            //记录一条警告级别的信息
            log.warn(username+"用户登录失败!");
            return "login.html";
        }
        session.setAttribute("user",tUser);
        log.debug("用户登录成功!");
        return "index.html";
    }
    @RequestMapping("/user/toLogin")
    public String tologin(){
        return "login.html";
    }
    @RequestMapping("/delete")
    public String delete(Long id){
        userService.deleteById(id);
        return "userList.html";
    }
    @RequestMapping("/user/sendCode")
    @ResponseBody
    public Map sendCode(String username){
        HashMap<String, Object> map = new HashMap<>();
        //发送消息
        try {
            rabbitTemplate.convertAndSend("sms.exchange","sms.verifyCode",username);
            //发送延时消息
//            rabbitTemplate.convertAndSend("sms.exchange","sms.verifyCode",username,(Message var1)->{
//                var1.getMessageProperties().setExpiration("1000");
//                 return var1;
//            });
            map.put("code",0);
        } catch (AmqpException e) {
            e.printStackTrace();
            map.put("code",1);
        }
        return map;
    }
    @SneakyThrows
    @GetMapping("/testLock")
    @ResponseBody
    public String test(){
        RLock lock = redissonClient.getLock("myLock");
        //尝试三秒的超时时间拿锁  拿到立即执行下面代码 拿不到就等待三秒超时
//        boolean b = lock.tryLock(3, TimeUnit.SECONDS);
        //3代表超时时间  4代表自动释放锁
        boolean b = lock.tryLock(3,4, TimeUnit.SECONDS);
        //非阻塞式加锁  加锁成功后会异步执行加锁成功后的方法
//        RFuture<Void> rFuture = lock.lockAsync(2, TimeUnit.SECONDS);
//        rFuture.whenCompleteAsync((res,e)->{
//            log.info("加锁成功");
//        });
        if (b){
            System.out.println("拿到锁了");
        }
        System.out.println("hello");
        return "hello";
    }

    @PostMapping("/test/filter")
    @ResponseBody
    public String filter(@RequestBody String map){
        JSONObject emailJson = JSONObject.parseObject(map);
        String email = emailJson.getString("email");
        System.out.println(email);
        return "请求成功";
    }
}
