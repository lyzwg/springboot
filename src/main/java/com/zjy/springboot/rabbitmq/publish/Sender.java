package com.zjy.springboot.rabbitmq.publish;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zjy.springboot.rabbitmq.ConnectionUtil;

/**
 * @author PAN
 * @create 2020-12-08-14:30
 */
public class Sender {
    private final static String EXCHANGE_NAME = "GIAO_fanout_exchange";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();

        // 声明exchange，指定类型为fanout
        channel.exchangeDeclare(EXCHANGE_NAME, "fanout");

        for (int i = 0; i <10 ; i++) {
            // 消息内容
            String message = "Hello everyone "+i;
            // 发布消息到Exchange
            channel.basicPublish(EXCHANGE_NAME, "", null, message.getBytes());
            System.out.println(" [生产者] Send '" + message + "'");
        }

        channel.close();
        connection.close();
    }
}
