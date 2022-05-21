package com.zjy.springboot.pojo;

//  created by zjy on 2022/1/9 22:27

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Product implements Serializable {
    private Long id;
    private String name;
    private BigDecimal price;
}
