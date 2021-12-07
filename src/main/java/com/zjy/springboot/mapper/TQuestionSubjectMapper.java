package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TQuestionSubject;
import com.zjy.springboot.pojo.TQuestionSubjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQuestionSubjectMapper {
    long countByExample(TQuestionSubjectExample example);

    int deleteByExample(TQuestionSubjectExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TQuestionSubject record);

    int insertSelective(TQuestionSubject record);

    List<TQuestionSubject> selectByExample(TQuestionSubjectExample example);

    TQuestionSubject selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TQuestionSubject record, @Param("example") TQuestionSubjectExample example);

    int updateByExample(@Param("record") TQuestionSubject record, @Param("example") TQuestionSubjectExample example);

    int updateByPrimaryKeySelective(TQuestionSubject record);

    int updateByPrimaryKey(TQuestionSubject record);
}