package com.zjy.springboot.controller;

//  created by zjy on 2021/11/28 20:40

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ThreadPoolExecutor;

@RestController
public class SendMessageController {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Resource
    ThreadPoolExecutor myThreadPool;


    @GetMapping("/sendDelay/{message}/{delayTime}")
    public String sendDelayMessage(@PathVariable("message") String message,@PathVariable("delayTime") Integer delayTime){
        //发送延时消息
            rabbitTemplate.convertAndSend("delay_exchange","delay_key",message,(Message var1)->{
                var1.getMessageProperties().setDelay(delayTime);
                 return var1;
            });
            return "发送一条延迟"+delayTime+"ms的消息 :"+message;
    }

    @GetMapping("/sendConfirm/{message}")
    public String sendConfirmMessage(@PathVariable("message") String message){
        CorrelationData correlationData = new CorrelationData("1");
        rabbitTemplate.convertAndSend("sms.exchange","sms.verifyCode111",message,correlationData);
        return "发送一条消息 :"+message;
    }


    @GetMapping("/test/starter")
    public String test(){
        int corePoolSize = myThreadPool.getCorePoolSize();
        return corePoolSize+"";
    }

    //最后会将myValue+param作为key，该方法返回值作为value 存入redis   下一次访问时直接从redis取  不会再执行方法
    @Cacheable(value = "myValue" ,key = "#param")
    @GetMapping("/test/cache/{param}")
    public String testCache(@PathVariable("param") String param){
        int corePoolSize = myThreadPool.getCorePoolSize();
        return param+":"+corePoolSize;
    }
}
