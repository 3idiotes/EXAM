package com.engin.dao;

import com.engin.model.BqCollectExample;
import com.engin.model.BqCollectKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BqCollectMapper {
    int countByExample(BqCollectExample example);

    int deleteByExample(BqCollectExample example);

    int deleteByPrimaryKey(BqCollectKey key);

    int insert(BqCollectKey record);

    int insertSelective(BqCollectKey record);

    List<BqCollectKey> selectByExample(BqCollectExample example);

    int updateByExampleSelective(@Param("record") BqCollectKey record, @Param("example") BqCollectExample example);

    int updateByExample(@Param("record") BqCollectKey record, @Param("example") BqCollectExample example);
}