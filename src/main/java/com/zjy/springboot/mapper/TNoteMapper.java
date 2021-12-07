package com.zjy.springboot.mapper;

import com.zjy.springboot.pojo.TNote;
import com.zjy.springboot.pojo.TNoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TNoteMapper {
    long countByExample(TNoteExample example);

    int deleteByExample(TNoteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TNote record);

    int insertSelective(TNote record);

    List<TNote> selectByExampleWithBLOBs(TNoteExample example);

    List<TNote> selectByExample(TNoteExample example);

    TNote selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TNote record, @Param("example") TNoteExample example);

    int updateByExampleWithBLOBs(@Param("record") TNote record, @Param("example") TNoteExample example);

    int updateByExample(@Param("record") TNote record, @Param("example") TNoteExample example);

    int updateByPrimaryKeySelective(TNote record);

    int updateByPrimaryKeyWithBLOBs(TNote record);

    int updateByPrimaryKey(TNote record);
}