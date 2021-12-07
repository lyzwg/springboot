package com.zjy.springboot.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/2 20:09
 * @Description:
 */
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor loginInterceptor;
    //添加拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)//添加拦截器类
        .addPathPatterns("/**").excludePathPatterns("/user/toLogin","/user/login","/js/**","/user/sendCode");
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pic/**").addResourceLocations("file:D:/pic/");
    }

    //视图映射
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //设置访问test会进入index页面
        registry.addViewController("/test").setViewName("index");
    }

}
