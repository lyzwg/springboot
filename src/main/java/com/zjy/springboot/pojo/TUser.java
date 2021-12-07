package com.zjy.springboot.pojo;

import lombok.Data;

import java.io.Serializable;

@Data//lombok注解 会自动生成get  set toString equals
public class TUser implements Serializable {
    private Long id;

    private String phone;

    private String username;

    private String password;

    private String salt;

    private Long classid;

    private String headpic;

    private String status;

    private String bak1;

    private String bak2;

    private String bak3;

    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", phone=").append(phone);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", classid=").append(classid);
        sb.append(", headpic=").append(headpic);
        sb.append(", status=").append(status);
        sb.append(", bak1=").append(bak1);
        sb.append(", bak2=").append(bak2);
        sb.append(", bak3=").append(bak3);
        sb.append("]");
        return sb.toString();
    }
}