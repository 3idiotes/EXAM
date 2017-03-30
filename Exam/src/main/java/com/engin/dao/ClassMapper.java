package com.engin.dao;

import com.engin.model.ClassExample;
import com.engin.model.ClassKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassMapper {
    int countByExample(ClassExample example);

    int deleteByExample(ClassExample example);

    int deleteByPrimaryKey(ClassKey key);

    int insert(ClassKey record);

    int insertSelective(ClassKey record);

    List<ClassKey> selectByExample(ClassExample example);
    
    List<ClassKey> selectClassid();

    int updateByExampleSelective(@Param("record") ClassKey record, @Param("example") ClassExample example);

    int updateByExample(@Param("record") ClassKey record, @Param("example") ClassExample example);
}