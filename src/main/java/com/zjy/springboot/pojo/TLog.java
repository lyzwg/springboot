package com.zjy.springboot.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/9 11:15
 * @Description:
 */
@Data
public class TLog {
    private Long id;
    private String data;
    private Date requesttime;
    private String requesturl;
    private Long userid;
    private String ip;
}
