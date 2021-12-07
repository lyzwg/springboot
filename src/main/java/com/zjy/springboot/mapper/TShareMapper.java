package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TShare;
import com.zjy.springboot.pojo.TShareExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TShareMapper {
    long countByExample(TShareExample example);

    int deleteByExample(TShareExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TShare record);

    int insertSelective(TShare record);

    List<TShare> selectByExample(TShareExample example);

    TShare selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TShare record, @Param("example") TShareExample example);

    int updateByExample(@Param("record") TShare record, @Param("example") TShareExample example);

    int updateByPrimaryKeySelective(TShare record);

    int updateByPrimaryKey(TShare record);
}