package com.engin.dao;

import com.engin.model.BigErrorExample;
import com.engin.model.BigErrorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BigErrorMapper {
    int countByExample(BigErrorExample example);

    int deleteByExample(BigErrorExample example);

    int deleteByPrimaryKey(BigErrorKey key);

    int insert(BigErrorKey record);

    int insertSelective(BigErrorKey record);

    List<BigErrorKey> selectByExample(BigErrorExample example);

    int updateByExampleSelective(@Param("record") BigErrorKey record, @Param("example") BigErrorExample example);

    int updateByExample(@Param("record") BigErrorKey record, @Param("example") BigErrorExample example);
}