package com.zjy.springboot.controller;

import com.zjy.springboot.config.Websocket;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/11/26 11:50
 * @Description:
 */
@RestController
@RequestMapping("/test/websocket/")
@Slf4j
public class WebsocketController {
    @Resource
    private Websocket websocket;

    @GetMapping("/sendMsg/{msg}")
    public String send(@PathVariable String msg) {
        Websocket.sendmes(msg);
        return "ok";
    }
}
