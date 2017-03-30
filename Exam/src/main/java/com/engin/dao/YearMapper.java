package com.engin.dao;

import com.engin.model.Year;
import com.engin.model.YearExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearMapper {
    int countByExample(YearExample example);

    int deleteByExample(YearExample example);

    int deleteByPrimaryKey(String year);

    int insert(Year record);

    int insertSelective(Year record);

    List<Year> selectByExample(YearExample example);

    int updateByExampleSelective(@Param("record") Year record, @Param("example") YearExample example);

    int updateByExample(@Param("record") Year record, @Param("example") YearExample example);
}