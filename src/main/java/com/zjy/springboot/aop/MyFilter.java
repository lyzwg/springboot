package com.zjy.springboot.aop;

//  created by zjy on 2021/12/9 14:45

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Map;

//该注解加上后 配置的urlPatterns不起作用  所有请求都会被拦截    解决方案https://blog.csdn.net/weixin_38152047/article/details/121244269
@Configuration
//@WebFilter(filterName = "myFilter", urlPatterns = {"/test"})
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String str = filterConfig.getInitParameter("excludeUrls");
        System.out.println(str);
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        //处理json报文请求
        MyHttpServletRequestWrapper requestWrapper = new MyHttpServletRequestWrapper(
                (HttpServletRequest) servletRequest);
        if (((HttpServletRequest) servletRequest).getRequestURI().contains("test")){
            // 读取请求内容
            BufferedReader br;
            br = requestWrapper.getReader();
            String line = null;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            // 将json字符串转换为json对象
            JSONObject jsonObject = JSONObject.parseObject(sb.toString());

            // 把json对象转换为Map集合
            Map<String, Object> map = JSON.toJavaObject(jsonObject, Map.class);
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                // 把邮箱地址转换为小写
                if (entry.getKey().equals("email")) {
                    map.put(entry.getKey(), entry.getValue().toString()
                            .toLowerCase());
                }
            }

            // 把参数转换之后放到我们的body里面
            String json = JSON.toJSONString(map);
            requestWrapper.setBody(json.getBytes("UTF-8"));
            // 放行
            chain.doFilter(requestWrapper, servletResponse);

        }else {
            chain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {

    }
}
