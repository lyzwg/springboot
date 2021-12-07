package com.zjy.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/2 17:38
 * @Description:
 */
@Controller
public class FunctionController {
    @RequestMapping("function")
    public String functionTest(ModelMap map){
        map.put("birthday",new Date());
        map.put("listData", Arrays.asList("张三","李四","王八"));
        map.put("arrayData",new String[]{"印度","非洲","阿拉善"});
        map.put("score",425);
        HashMap<String, String> hashMap = new HashMap<>();
        map.put("hashMap",hashMap);
        map.put("蔡徐坤","100");
        return "function";
    }
}
