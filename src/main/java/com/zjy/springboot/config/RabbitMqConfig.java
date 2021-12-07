package com.zjy.springboot.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/8 17:01
 * @Description:
 */
@Configuration
public class RabbitMqConfig {
    //注入连接工厂
    @Autowired
    private ConnectionFactory connectionFactory;

    /**
     * 配置rabbitTemplate
     * @return
     */
    
    @Bean
    public RabbitTemplate rabbitTemplate(){
        return new RabbitTemplate(connectionFactory);
    }

    /**
     * 定义队列
     * @return
     */
    @Bean
    public Queue smsQueue(){
        HashMap<String, Object> map = new HashMap<>();
        //设置惰性队列  队列中的消息会存到硬盘中  需要消费的时候再读取到内存中  （针对队列中堆积很多消息的时候）
        map.put("x-queue-mode","lazy");
        return new Queue("sms.verifyCode",true,false,false,map);
    }
    @Bean
    public Queue delayQueue(){
        return new Queue("delay_queue");
    }
    @Bean
    public Queue backUpQueue(){
        return new Queue("backUp_queue");
    }
    @Bean
    public Queue warningQueue(){
        return new Queue("warning_queue");
    }

    /**
     * 定义交换机
     * @return
     */
    @Bean
    public DirectExchange smsExchange(){
        //原交换机挂了后  转至备份交换机
        HashMap<String, Object> map = new HashMap<>();
        map.put("alternate-exchange","backUp_exchange");
        return ExchangeBuilder.directExchange("sms.exchange").durable(true).withArguments(map).build();
//        return new DirectExchange("sms.exchange",true,false);
    }

    //备份交换机
    @Bean
    public FanoutExchange backUpExchange(){
        return new FanoutExchange("backUp_exchange",true,false);
    }

    //延迟交换机
    @Bean
    public CustomExchange delayExchange(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("x-delayed-type","direct");
        return new CustomExchange("delay_exchange","x-delayed-message",true,false,map);
    }

    /**
     * 绑定队列到交换机
     * @return
     */
    @Bean
    public Binding smsVerifyCodeBinding(){

        return BindingBuilder.bind(smsQueue())//绑定队列
                .to(smsExchange())//指定交换机
                .with("sms.verifyCode");//路由规则
    }

    @Bean
    public Binding delayBinding(){
        return BindingBuilder.bind(delayQueue())//绑定队列
                .to(delayExchange())//指定交换机
                .with("delay_key").noargs();//路由规则
    }

    @Bean
    public Binding backUpBinding(){
        return BindingBuilder.bind(backUpQueue()).to(backUpExchange());
    }

    @Bean
    public Binding backUptoWarnBinding(){
        return BindingBuilder.bind(warningQueue()).to(backUpExchange());
    }
}
