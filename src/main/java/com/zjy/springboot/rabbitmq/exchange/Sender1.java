package com.zjy.springboot.rabbitmq.exchange;

//  created by zjy on 2021/11/23 16:19

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmCallback;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import com.zjy.springboot.rabbitmq.ConnectionUtil;
import lombok.SneakyThrows;

import java.util.Scanner;

public class Sender1 {

    public static String EXCHANGE_NAME="exchange1";
    @SneakyThrows
    public static void main(String[] args) {
        //1.建立连接
        Connection connection = ConnectionUtil.getConnection();
        //2.建立通道
        Channel channel = connection.createChannel();

        channel.confirmSelect();//开启发布确认
        //3.声明队列
        channel.exchangeDeclare(EXCHANGE_NAME,"fanout");
        //消息确认成功回调函数
        ConfirmCallback ackConfirmCallback=(long var1, boolean var3)->{
            System.out.println("确认的消息:"+var1);
        };
        //消息确认失败回调函数
        ConfirmCallback noAckConfirmCallback =(long var1, boolean var3)->{
            System.out.println("确认失败的消息:"+var1);
        };
        //添加异步监听发布确认
        channel.addConfirmListener(ackConfirmCallback,noAckConfirmCallback);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String message = sc.next();
            channel.basicPublish(
                    EXCHANGE_NAME,//exchange 交换机 ""表示使用默认
                    "route_key1",// routing_key 路由key
                    MessageProperties.PERSISTENT_TEXT_PLAIN,//设置消息持久化   不需要的话可以设置为null
                    message.getBytes());//消息

/*            boolean flag = channel.waitForConfirms();//单个确认
            if (flag) {
                System.out.println("消息发送成功：" + message);
            }*/
            System.out.println("消息发送成功：" + message);
        }
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
