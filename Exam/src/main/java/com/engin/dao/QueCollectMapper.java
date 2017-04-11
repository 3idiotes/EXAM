package com.engin.dao;

import com.engin.model.QueCollectExample;
import com.engin.model.QueCollectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QueCollectMapper {
    int countByExample(QueCollectExample example);

    int deleteByExample(QueCollectExample example);

    int deleteByPrimaryKey(QueCollectKey key);

    int insert(QueCollectKey record);

    int insertSelective(QueCollectKey record);

    List<QueCollectKey> selectByExample(QueCollectExample example);

    int updateByExampleSelective(@Param("record") QueCollectKey record, @Param("example") QueCollectExample example);

    int updateByExample(@Param("record") QueCollectKey record, @Param("example") QueCollectExample example);
}