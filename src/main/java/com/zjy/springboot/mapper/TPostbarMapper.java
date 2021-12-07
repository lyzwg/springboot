package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TPostbar;
import com.zjy.springboot.pojo.TPostbarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPostbarMapper {
    long countByExample(TPostbarExample example);

    int deleteByExample(TPostbarExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPostbar record);

    int insertSelective(TPostbar record);

    List<TPostbar> selectByExample(TPostbarExample example);

    TPostbar selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPostbar record, @Param("example") TPostbarExample example);

    int updateByExample(@Param("record") TPostbar record, @Param("example") TPostbarExample example);

    int updateByPrimaryKeySelective(TPostbar record);

    int updateByPrimaryKey(TPostbar record);
}