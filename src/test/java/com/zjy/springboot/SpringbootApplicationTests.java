package com.zjy.springboot;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zjy.springboot.mapper.UserMapper;
import com.zjy.springboot.pojo.TUser;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

@SpringBootTest
class SpringbootApplicationTests {
    @Resource
    private UserMapper userMapper;
    @Autowired
    DataSource dataSource;
    @Autowired
    AmqpAdmin amqpAdmin;
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Resource
    ThreadPoolExecutor threadPoolAutoConfiguration;
    @Test
    void contextLoads() {
    }
    @Test
    public void createExchange(){
//        amqpAdmin.declareExchange(new DirectExchange("amqpadmin.exchange"));
//        System.out.println("创建交换器完成");

        //创建持久化队列
//        amqpAdmin.declareQueue(new Queue("amqpadmin.queue",true));
//        System.out.println("创建队列成功");

        //创建绑定规则
        //queue名,类型,exchange名,路由键,绑定参数
        amqpAdmin.declareBinding(
                new Binding("amqpadmin.queue", Binding.DestinationType.QUEUE,
                        "amqpadmin.exchange","ampd.haha",null));
    }

    @Test
    public void test() throws SQLException {
        System.out.println(dataSource);
        System.out.println(dataSource.getConnection());
    }

    @Test
    public void page(){
        PageHelper.startPage(1,1);
        List<TUser> tUsers = userMapper.selectAll();
        PageInfo<TUser> pageInfo = new PageInfo<>(tUsers);
        System.out.println(pageInfo);
    }
    @Test
    public void test1(){
        System.out.println(threadPoolAutoConfiguration.getCorePoolSize());
    }
}
