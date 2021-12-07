package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TFile;
import com.zjy.springboot.pojo.TFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFileMapper {
    long countByExample(TFileExample example);

    int deleteByExample(TFileExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TFile record);

    int insertSelective(TFile record);

    List<TFile> selectByExample(TFileExample example);

    TFile selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TFile record, @Param("example") TFileExample example);

    int updateByExample(@Param("record") TFile record, @Param("example") TFileExample example);

    int updateByPrimaryKeySelective(TFile record);

    int updateByPrimaryKey(TFile record);
}