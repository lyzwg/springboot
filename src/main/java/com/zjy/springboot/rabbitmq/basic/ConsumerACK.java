package com.zjy.springboot.rabbitmq.basic;

import com.rabbitmq.client.*;
import com.zjy.springboot.rabbitmq.ConnectionUtil;

import java.util.concurrent.TimeUnit;

/**
 * 消费者获取消息
 * @author bigpeng
 * @create 2020-12-08-14:13
 */
public class ConsumerACK {
    private final static String QUEUE_NAME = "ack_queue";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 创建通道
        Channel channel = connection.createChannel();

        channel.basicQos(1);//默认采用轮询发送的方式 设置为1表示不公平分发 即哪个消费者空闲发送给谁
        // 声明队列
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        // 发送消息回调函数
        DeliverCallback deliverCallback =(String var1, Delivery var2)->{
            String msg = new String(var2.getBody());
            System.out.println(" [x] received : " + msg);
            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //应答消息
            channel.basicAck(var2.getEnvelope().getDeliveryTag(),false);
            //拒绝消息  第二个参数表示拒绝后是否放回队列
//            channel.basicReject(var2.getEnvelope().getDeliveryTag(),false);
        };
        //取消消费回调函数
        CancelCallback cancelCallback = (String var1)->{
            System.out.println("消费者取消消费");
        };
        // 监听队列，第二个参数：是否自动进行消息确认。
        System.out.println("消费者2 等待接收消息。。。。。。。。");
        //手动应答
        boolean autoACK=false;
        //参数1：队列名   2：消费成功是否自动应答   3.消费失败回调方法   4.消费者取消消费的回调
        channel.basicConsume(QUEUE_NAME, autoACK, deliverCallback,cancelCallback);
    }
}
