package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TQuestionOptions;
import com.zjy.springboot.pojo.TQuestionOptionsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionOptionsMapper {
    long countByExample(TQuestionOptionsExample example);

    int deleteByExample(TQuestionOptionsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionOptions record);

    int insertSelective(TQuestionOptions record);

    List<TQuestionOptions> selectByExample(TQuestionOptionsExample example);

    TQuestionOptions selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionOptions record, @Param("example") TQuestionOptionsExample example);

    int updateByExample(@Param("record") TQuestionOptions record, @Param("example") TQuestionOptionsExample example);

    int updateByPrimaryKeySelective(TQuestionOptions record);

    int updateByPrimaryKey(TQuestionOptions record);
}