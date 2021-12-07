package com.zjy.springboot.rabbitmq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/9 10:02
 * @Description:
 */
@Component
@Slf4j
public class Consumer {
    @Autowired
    private RedisTemplate redisTemplate;
    RabbitTemplate rabbitTemplate;
    //用来监听指定的队列
    @RabbitListener(queues = "sms.verifyCode",containerFactory = "rabbitListenerContainerFactory")
    public  void sendSms(String username) throws InterruptedException {
        int i = (int) (Math.random() * 8999 + 1000);
        Thread.sleep(1000);
        log.info("发送验证码成功!用户名:{},验证码:{}",username,i);
        redisTemplate.opsForValue().set("code:"+username,i,1, TimeUnit.MINUTES);
    }

    @RabbitListener(queues = "delay_queue",containerFactory = "rabbitListenerContainerFactory")
    public  void getDelayMessage(Message message) throws InterruptedException {
        Integer delay = message.getMessageProperties().getReceivedDelay();
        String msg = new String(message.getBody());
        System.out.println("收到一条延迟："+delay+"ms的消息："+msg);
    }

    @RabbitListener(queues = "warning_queue",containerFactory = "rabbitListenerContainerFactory")
    public  void getWarnMessage(Message message) throws InterruptedException {
        String exchange = message.getMessageProperties().getReceivedExchange();
        String msg = new String(message.getBody());
        System.out.println(exchange+"交换机消息发送出错,收到一条报警消息："+msg);
    }
}
