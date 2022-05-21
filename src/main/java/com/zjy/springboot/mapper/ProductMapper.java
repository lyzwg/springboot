package com.zjy.springboot.mapper;

//  created by zjy on 2022/1/9 22:59

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjy.springboot.pojo.Product;

public interface ProductMapper extends BaseMapper<Product> {
//    @Insert("insert into product(name,price)values(#{name},#{price})")
//    void insert(Product product);

//    @Select("select name from product where id=#{id}")
    Product selectByMyId(Long id);
}
