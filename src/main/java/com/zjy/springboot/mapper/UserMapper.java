package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Select("select * from t_user")
    List<TUser> selectAll();

    TUser selectById(Long id);

    @Select("select * from t_user where username=#{username}")
    TUser selectByName(String username);

    @Delete("delete from t_user where id=#{id}")
    int delete(Long id);
}
