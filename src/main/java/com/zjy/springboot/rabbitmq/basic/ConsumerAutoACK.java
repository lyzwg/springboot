package com.zjy.springboot.rabbitmq.basic;

import com.rabbitmq.client.*;
import com.zjy.springboot.rabbitmq.ConnectionUtil;

import java.io.IOException;

/**
 * 消费者获取消息
 * @author bigpeng
 * @create 2020-12-08-14:13
 */
public class ConsumerAutoACK {
    private final static String QUEUE_NAME = "cxk_simple_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
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
        System.out.println("消费者2 等待接收消息。。。。。。。。");
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }
}
