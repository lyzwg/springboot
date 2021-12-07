package com.zjy.springboot.rabbitmq.deadQueue;

//  created by zjy on 2021/11/28 15:21

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zjy.springboot.rabbitmq.ConnectionUtil;
import lombok.SneakyThrows;

public class Producer {
    @SneakyThrows
    public static void main(String[] args) {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //验证死信消息  设置TTL时间 单位为ms   (该特性可以用来做延迟队列 )
        AMQP.BasicProperties properties = new AMQP.BasicProperties().builder().expiration("10000").build();
        for (int i = 1; i < 11; i++) {
            String message = "message" + i;
            channel.basicPublish("normal_exchange", "normal_key", properties, message.getBytes());
            System.out.println(message);
        }
        channel.close();
        connection.close();
    }
}
