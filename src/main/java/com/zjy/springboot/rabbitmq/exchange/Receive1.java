package com.zjy.springboot.rabbitmq.exchange;

//  created by zjy on 2021/11/23 16:02

import com.rabbitmq.client.*;
import com.zjy.springboot.rabbitmq.ConnectionUtil;
import lombok.SneakyThrows;

import java.io.IOException;

public class Receive1 {

    public static String EXCHANGE_NAME="exchange1";
    @SneakyThrows
    public static void main(String[] args) {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        //声明一个交换机
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");
        //声明一个临时队列
        String queue = channel.queueDeclare().getQueue();
        //将交换机和队列绑定
        channel.queueBind(queue,EXCHANGE_NAME,"route_key1");

        DefaultConsumer consumer = new DefaultConsumer(channel) {
            // 获取消息，并且处理，这个方法类似事件监听，如果有消息的时候，会被自动调用
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope, AMQP.BasicProperties properties,
                                       byte[] body) throws IOException {
                // body 即消息体
                String msg = new String(body);
                System.out.println(" [消费者1] received : " + msg );
            }
        };
        channel.basicConsume(queue,true,consumer);
    }
}
