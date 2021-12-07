package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TPaper;
import com.zjy.springboot.pojo.TPaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPaperMapper {
    long countByExample(TPaperExample example);

    int deleteByExample(TPaperExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPaper record);

    int insertSelective(TPaper record);

    List<TPaper> selectByExample(TPaperExample example);

    TPaper selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPaper record, @Param("example") TPaperExample example);

    int updateByExample(@Param("record") TPaper record, @Param("example") TPaperExample example);

    int updateByPrimaryKeySelective(TPaper record);

    int updateByPrimaryKey(TPaper record);
}