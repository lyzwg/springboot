package com.zjy.springboot.controller;

//  created by zjy on 2021/12/7 21:30

import com.zjy.springboot.service.RetryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RetryController {

    @Autowired
    RetryService retryService;

    @GetMapping("testRetry")
    public String testAsync() {
        retryService.testRetry();
        return "测试重试";
    }
}
