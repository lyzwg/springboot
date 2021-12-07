package com.zjy.springboot.rabbitmq.basic;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.ConfirmCallback;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.MessageProperties;
import com.zjy.springboot.rabbitmq.ConnectionUtil;
import lombok.SneakyThrows;

import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeoutException;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/8 11:28
 * @Description:
 */
public class Producer {
    @SneakyThrows
    public static void main(String[] args) throws IOException, TimeoutException {
        //1.建立连接
        Connection connection = ConnectionUtil.getConnection();
        //2.建立通道
        Channel channel = connection.createChannel();

        channel.confirmSelect();//开启发布确认
        //3.声明队列
        channel.queueDeclare(
                "ack_queue",//队列名称
                true,//设置是否持久化
                false,//设置是否排他（仅申明他的连接可见）
                false,//是否自动删除
                null);//参数设置

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
                    "",//exchange 交换机 ""表示使用默认
                    "ack_queue",// routing_key 路由key
                    MessageProperties.PERSISTENT_TEXT_PLAIN,//设置消息持久化   不需要的话可以设置为null
                    message.getBytes());//消息

/*            boolean flag = channel.waitForConfirms();//单个确认
            if (flag) {
                System.out.println("消息发送成功：" + message);
            }*/
            System.out.println("消息发送成功：" + message);
        }
//        for (int i = 0; i <10 ; i++) {
//            String message=" hello rabbit"+i;
//            //通过channel发送消息
//            channel.basicPublish(
//                    "",//exchange 交换机 ""表示使用默认
//                    "cxk_simple_queue",// routing_key 路由key
//                    null,//设置项
//                    message.getBytes());//消息
//            System.out.println("消息发送成功："+message);
//        }
        //关闭通道和连接
        channel.close();
        connection.close();
    }
}
