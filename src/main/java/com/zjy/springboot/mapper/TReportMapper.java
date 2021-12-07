package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TReport;
import com.zjy.springboot.pojo.TReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TReportMapper {
    long countByExample(TReportExample example);

    int deleteByExample(TReportExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TReport record);

    int insertSelective(TReport record);

    List<TReport> selectByExample(TReportExample example);

    TReport selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TReport record, @Param("example") TReportExample example);

    int updateByExample(@Param("record") TReport record, @Param("example") TReportExample example);

    int updateByPrimaryKeySelective(TReport record);

    int updateByPrimaryKey(TReport record);
}