package com.engin.dao;

import com.engin.model.ErrorExample;
import com.engin.model.ErrorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ErrorMapper {
    int countByExample(ErrorExample example);

    int deleteByExample(ErrorExample example);

    int deleteByPrimaryKey(ErrorKey key);

    int insert(ErrorKey record);

    int insertSelective(ErrorKey record);

    List<ErrorKey> selectByExample(ErrorExample example);
    
    List<String> selectQusIdByUser(String username);

    int updateByExampleSelective(@Param("record") ErrorKey record, @Param("example") ErrorExample example);

    int updateByExample(@Param("record") ErrorKey record, @Param("example") ErrorExample example);
}