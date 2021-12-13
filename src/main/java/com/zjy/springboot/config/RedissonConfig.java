package com.zjy.springboot.config;

//  created by zjy on 2021/12/8 10:09

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RedissonConfig {
/*    @SneakyThrows
    @Bean
    public RedissonClient redissonClient(){
        Config config = Config.fromYAML(RedissonConfig.class.getClassLoader().getResource("redisson-config.yml"));
        return Redisson.create(config);
    }*/

    //也可以基于配置文件配置
    @Bean
    public RedissonClient redissonClient(){
        Config config = new Config();
        //集群环境
//        config.useClusterServers().addNodeAddress("redis://101.132.73.120:6379").addNodeAddress("redis://101.132.73.120:6378");
        config.useSingleServer().setAddress("redis://101.132.73.120:6379");
        return Redisson.create(config);
    }
}
