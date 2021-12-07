package com.zjy.springboot.rabbitmq.deadQueue;

//  created by zjy on 2021/11/26 18:17

import com.rabbitmq.client.*;
import com.zjy.springboot.rabbitmq.ConnectionUtil;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.HashMap;

//死信队列
public class Receiver {
    @SneakyThrows
    public static void main(String[] args) {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 声明队列

        HashMap<String, Object> map = new HashMap<>();
        //设置死信交换机
        map.put("x-dead-letter-exchange","dead_exchange");
        //设置死信routing key
        map.put("x-dead-letter-routing-key","dead_key");
        //设置正常队列长度的限制   （超过的消息会进入死信队列）
        map.put("x-max-length",6);
        //设置过期时间  单位毫秒
//        map.put("x-message-ttl",10000);   //一般都是生产者发消息时设置过期时间 这里不设置

        //声明交换机
        channel.exchangeDeclare("normal_exchange","fanout");
        channel.exchangeDeclare("dead_exchange","fanout");
        //声明队列   （声明交换机也可放在发送者的代码里）
        channel.queueDeclare("normal_queue", false, false, false, map);
        channel.queueDeclare("dead_queue", false, false, false, null);
        //绑定交换机和队列的路由key
        channel.queueBind("dead_queue","dead_exchange","dead_key");
        channel.queueBind("normal_queue","normal_exchange","normal_key");
        // 定义队列的消费者，在消费者中定义一个处理消息的方法
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [x] received : " + msg);
            }
        };
        //参数1：队列名   2：消费成功是否自动应答   3.消费失败回调方法   4.消费者取消消费的回调
//        channel.basicConsume(QUEUE_NAME,true)
        // 监听队列，第二个参数：是否自动进行消息确认。
        System.out.println("消费者 等待接收消息。。。。。。。。");
        channel.basicConsume("dead_queue", true, consumer);
    }
}
