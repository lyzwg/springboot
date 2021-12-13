package com.zjy.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

//@EnableRabbit//开启基于注解的rabbitmq模式
@MapperScan("com.zjy.springboot.mapper")//扫描mybatis接口
@SpringBootApplication
@EnableAsync
@EnableRetry
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
