package com.zjy.springboot.rabbitmq;

//  created by zjy on 2021/11/29 20:19

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Slf4j
@Component
public class MyCallBack implements RabbitTemplate.ConfirmCallback, RabbitTemplate.ReturnsCallback {
    @Autowired
    RabbitTemplate rabbitTemplate;

    @PostConstruct
    //需要将该实现的类注入到rabbitmq的confirmCallback属性中
    public void init() {
        rabbitTemplate.setMandatory(true);
        rabbitTemplate.setConfirmCallback(this);
        rabbitTemplate.setReturnsCallback(this);
    }

    @Override
    public void confirm(CorrelationData correlationData, boolean ack, String reason) {
        String id = correlationData == null ? "" : correlationData.getId();

        String receivedExchange = null;
        if (correlationData != null) {
            receivedExchange = correlationData.getReturnedMessage().getMessageProperties().getReceivedExchange();
        }
        if (ack) {
            log.info(receivedExchange + "交换机已经收到id为{}的消息", id);
        } else {
            log.info(receivedExchange + "交换机未收到id为{}的消息，原因为{}", id, reason);
        }
    }


    //消息发出后送不到队列中时回退给发送者
    @Override
    public void returnedMessage(ReturnedMessage returnedMessage) {
        log.info("消息{}被交换机{}回退了,退回原因:{},路由key:{}",
                new String(returnedMessage.getMessage().getBody()), returnedMessage.getExchange(), returnedMessage.getReplyText(), returnedMessage.getRoutingKey());
    }
}
