package com.engin.dao;

import com.engin.model.College;
import com.engin.model.CollegeExample;
import com.engin.model.CollegeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(CollegeKey key);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);
    
    List<College> selectCidAndName();// 用来注册

    College selectByPrimaryKey(CollegeKey key);

    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}