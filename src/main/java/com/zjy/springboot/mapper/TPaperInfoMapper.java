package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TPaperInfo;
import com.zjy.springboot.pojo.TPaperInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TPaperInfoMapper {
    long countByExample(TPaperInfoExample example);

    int deleteByExample(TPaperInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TPaperInfo record);

    int insertSelective(TPaperInfo record);

    List<TPaperInfo> selectByExample(TPaperInfoExample example);

    TPaperInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TPaperInfo record, @Param("example") TPaperInfoExample example);

    int updateByExample(@Param("record") TPaperInfo record, @Param("example") TPaperInfoExample example);

    int updateByPrimaryKeySelective(TPaperInfo record);

    int updateByPrimaryKey(TPaperInfo record);
}