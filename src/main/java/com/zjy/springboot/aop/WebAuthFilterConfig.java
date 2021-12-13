package com.zjy.springboot.aop;

//  created by zjy on 2021/12/9 20:13

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;

@Configuration
public class WebAuthFilterConfig {
    @Bean
    public FilterRegistrationBean webAuthFilterRegistration() {
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(webAuthFilter());
        registration.setName("myFilter");
        registration.addUrlPatterns("/test/filter");
        registration.addInitParameter("excludeUrls", "/web/login");
        registration.setOrder(0);
        return registration;
    }

    @Bean
    public Filter webAuthFilter() {
        return new MyFilter();
    }
}
