package com.zjy.springboot.rabbitmq.routing;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.zjy.springboot.rabbitmq.ConnectionUtil;

/**
 * @author bigpeng
 * @create 2020-12-08-14:48
 */
public class Sender {
    private final static String EXCHANGE_NAME = "GIAO_direct_exchange";

    public static void main(String[] argv) throws Exception {
        // 获取到连接
        Connection connection = ConnectionUtil.getConnection();
        // 获取通道
        Channel channel = connection.createChannel();
        // 声明exchange，指定类型为direct
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        // 消息内容
        String message = "商品新增了， id = 1001";
        // 发送消息，并且指定routing key 为：insert ,代表新增商品
        channel.basicPublish(EXCHANGE_NAME, "insert", null, message.getBytes());
        channel.basicPublish(EXCHANGE_NAME, "update", null, "修改商品 11".getBytes());
        channel.basicPublish(EXCHANGE_NAME, "delete", null, "删除商品 22".getBytes());
        System.out.println("发送消息成功！");
        channel.close();
        connection.close();
    }
}
