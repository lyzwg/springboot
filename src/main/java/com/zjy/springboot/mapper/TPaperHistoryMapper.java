package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TPaperHistory;
import com.zjy.springboot.pojo.TPaperHistoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPaperHistoryMapper {
    long countByExample(TPaperHistoryExample example);

    int deleteByExample(TPaperHistoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPaperHistory record);

    int insertSelective(TPaperHistory record);

    List<TPaperHistory> selectByExample(TPaperHistoryExample example);

    TPaperHistory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPaperHistory record, @Param("example") TPaperHistoryExample example);

    int updateByExample(@Param("record") TPaperHistory record, @Param("example") TPaperHistoryExample example);

    int updateByPrimaryKeySelective(TPaperHistory record);

    int updateByPrimaryKey(TPaperHistory record);
}