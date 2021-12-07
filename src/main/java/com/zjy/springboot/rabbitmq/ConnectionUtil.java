package com.zjy.springboot.rabbitmq;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/8 11:21
 * @Description:
 */
public class ConnectionUtil {
    public static String QUEUE_NAME="ack_queue";

    public static Connection getConnection() throws IOException, TimeoutException {
        ConnectionFactory factory=new ConnectionFactory();
        factory.setHost("101.132.73.120");//主机
        factory.setPort(5672);//java操作mq的端口号
//        factory.setVirtualHost("/zjy");
        factory.setUsername("admin");
        factory.setPassword("admin");
        return factory.newConnection();
    }
}
