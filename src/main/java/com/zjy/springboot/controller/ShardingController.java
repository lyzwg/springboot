package com.zjy.springboot.controller;

//  created by zjy on 2022/1/9 23:49

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zjy.springboot.mapper.ProductMapper;
import com.zjy.springboot.pojo.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Random;

@RestController
public class ShardingController {
    @Resource
    ProductMapper productMapper;

    @GetMapping("/add/{name}")
    public String add(@PathVariable("name") String name) {
        Product product = new Product();
        product.setName(name);
        product.setPrice(new BigDecimal(new Random().nextInt(5000)));
        productMapper.insert(product);
        return "添加成功";
    }

    @GetMapping("/get/{id}")
    public String get(@PathVariable("id") Long id) {
        QueryWrapper<Product> wrapper = new QueryWrapper<>();
        wrapper.eq("id", id);
//        Product product = productMapper.selectOne(wrapper);
        Product product = productMapper.selectByMyId(id);
        return product == null ? "空" : product.getName();
    }
}
