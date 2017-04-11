package com.engin.dao;

import com.engin.model.HisExam;
import com.engin.model.HisExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HisExamMapper {
    int countByExample(HisExamExample example);

    int deleteByExample(HisExamExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HisExam record);

    int insertSelective(HisExam record);

    List<HisExam> selectByExample(HisExamExample example);

    HisExam selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HisExam record, @Param("example") HisExamExample example);

    int updateByExample(@Param("record") HisExam record, @Param("example") HisExamExample example);

    int updateByPrimaryKeySelective(HisExam record);

    int updateByPrimaryKey(HisExam record);
}