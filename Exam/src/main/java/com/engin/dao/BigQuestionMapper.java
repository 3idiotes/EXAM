package com.engin.dao;

import com.engin.model.BigQuestion;
import com.engin.model.BigQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BigQuestionMapper {
    int countByExample(BigQuestionExample example);

    int deleteByExample(BigQuestionExample example);

    int deleteByPrimaryKey(Integer bqid);

    int insert(BigQuestion record);

    int insertSelective(BigQuestion record);

    List<BigQuestion> selectByExampleWithBLOBs(BigQuestionExample example);

    List<BigQuestion> selectByExample(BigQuestionExample example);

    BigQuestion selectByPrimaryKey(Integer bqid);

    int updateByExampleSelective(@Param("record") BigQuestion record, @Param("example") BigQuestionExample example);

    int updateByExampleWithBLOBs(@Param("record") BigQuestion record, @Param("example") BigQuestionExample example);

    int updateByExample(@Param("record") BigQuestion record, @Param("example") BigQuestionExample example);

    int updateByPrimaryKeySelective(BigQuestion record);

    int updateByPrimaryKeyWithBLOBs(BigQuestion record);
}