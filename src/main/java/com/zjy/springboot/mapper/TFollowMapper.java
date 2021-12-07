package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TFollow;
import com.zjy.springboot.pojo.TFollowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFollowMapper {
    long countByExample(TFollowExample example);

    int deleteByExample(TFollowExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFollow record);

    int insertSelective(TFollow record);

    List<TFollow> selectByExample(TFollowExample example);

    TFollow selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFollow record, @Param("example") TFollowExample example);

    int updateByExample(@Param("record") TFollow record, @Param("example") TFollowExample example);

    int updateByPrimaryKeySelective(TFollow record);

    int updateByPrimaryKey(TFollow record);
}