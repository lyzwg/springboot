package com.zjy.springboot.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/3 11:32
 * @Description: 全局异常处理
 * 定制错误数据
 */
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    //括号中指定特定的异常类
    /*@ResponseBody
    @ExceptionHandler(FileNotFoundException.class)
    //没有自适应效果  给浏览器和客户端都返回一样的json数据
    public Map fileNotFoundExceptionHandler(Exception e){
        Map<String, Object> map = new HashMap<>();
        map.put("code","fileNotFind");
        map.put("message",e.getMessage());
        log.error("全局异常处理，捕获到异常",e);
        return map;
    }*/

    //有适应效果
    @ExceptionHandler(FileNotFoundException.class)
    public String fileNotFoundExceptionHandler(Exception e, HttpServletRequest request){
        Map<String, Object> map = new HashMap<>();
        map.put("code","fileNotFind");
        map.put("message",e.getMessage());

        //传入自己的错误代码 4xx 5xx 否则就不会进入定制错误页面的解析流程
        request.setAttribute("javax.servlet.error.status_code",400);
        log.error("全局异常处理，捕获到异常",e);
        //转发到/error
        return "forward:/error";
    }
}
