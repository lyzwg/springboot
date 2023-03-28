package com.zjy.springboot.controller;

import lombok.extern.slf4j.Slf4j;

import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;


//@Component
@Slf4j
@ServerEndpoint("/websocket/test")
public class Websocket {

    private Session session;


    public static CopyOnWriteArraySet<Websocket> set = new CopyOnWriteArraySet<>() ;

    @OnOpen
    public void onOpean(Session session){
        this.session = session;
        set.add(this);
        log.info("websocket建立连接"+"连接总数 "+set.size());
    }


    @OnClose
    public void onClose(){

        set.remove(this);
        log.info("websocket关闭连接"+set.size());

    }

    @OnMessage
    public void onMessage(String mes){

        log.info("收到的消息"+mes);
    }


    public static void sendmes(String s){

        log.info("像前端发送消息");
        for (Websocket websocket : set) {
            try {
                websocket.session.getBasicRemote().sendText(s);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }





}
