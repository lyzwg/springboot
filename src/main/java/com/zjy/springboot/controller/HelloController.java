package com.zjy.springboot.controller;

import com.zjy.springboot.mapper.UserMapper;
import com.zjy.springboot.pojo.TUser;
import com.zjy.springboot.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/11/26 11:50
 * @Description:
 */
@RestController
@Slf4j
public class HelloController {
    @Resource
    private UserMapper userMapper;
    @Resource
    private AsyncService asyncService;

    @RequestMapping("hello")
    public String test(String name) {
        log.info("hello {}", name);
        return "hello " + name;
    }

    @RequestMapping("/user/list")
    public List<TUser> selectAll() {
        return userMapper.selectAll();
    }

    @RequestMapping("hello2")
    public ModelAndView hello2() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("hello.html");
        //向页面传值
        mv.addObject("msg", "hello thymeleaf");
        mv.addObject("hobbyList", Arrays.asList("偷电瓶", "摇头", "干架"));
        mv.addObject("sex", "1");
        mv.addObject("score", "100");
        return mv;
    }

    @RequestMapping("index")
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index.html");
        return mv;
    }

    @GetMapping("testAsync")
    public String testAsync() {
        asyncService.testAsync();
        return "返回数据成功";
    }
}
