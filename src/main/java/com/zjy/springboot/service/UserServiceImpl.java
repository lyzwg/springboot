package com.zjy.springboot.service;

import com.zjy.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/3 14:48
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate redisTemplate;
    //声明事务
    @Transactional(propagation = Propagation.REQUIRED/*指定传播特性*/
            ,isolation = Isolation.READ_COMMITTED)//指定隔离级别
    @Override
    public boolean deleteById(Long id) {
        int i = userMapper.delete(id);
        int a=3/0;
        redisTemplate.delete("userList");
        return true;
    }
    
}
