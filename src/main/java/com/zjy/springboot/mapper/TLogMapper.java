package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TLog;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;
import org.springframework.stereotype.Component;

/**
 * @Auther: 岚烟载挽歌
 * @Date: 2020/12/9 11:36
 * @Description:
 */
@Component
public interface TLogMapper {
    @Insert("insert into t_log (id,ip,data,userid,requesturl) values (#{id},#{ip},#{data},#{userid},#{requesturl})")
    @SelectKey(before = true,resultType = long.class,keyProperty = "id",statement = "select seq_t_user.nextval from dual")
    int insert(TLog log);
}
