package com.zjy.springboot.controller;

//  created by zjy on 2021/11/28 20:40

import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SendMessageController {
    @Autowired
    RabbitTemplate rabbitTemplate;

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
}
