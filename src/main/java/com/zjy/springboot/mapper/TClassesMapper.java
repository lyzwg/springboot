package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TClasses;
import com.zjy.springboot.pojo.TClassesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TClassesMapper {
    long countByExample(TClassesExample example);

    int deleteByExample(TClassesExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TClasses record);

    int insertSelective(TClasses record);

    List<TClasses> selectByExample(TClassesExample example);

    TClasses selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TClasses record, @Param("example") TClassesExample example);

    int updateByExample(@Param("record") TClasses record, @Param("example") TClassesExample example);

    int updateByPrimaryKeySelective(TClasses record);

    int updateByPrimaryKey(TClasses record);
}