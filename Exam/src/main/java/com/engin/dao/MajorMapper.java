package com.engin.dao;

import com.engin.model.Major;
import com.engin.model.MajorExample;
import com.engin.model.MajorKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorMapper {
    int countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    int deleteByPrimaryKey(MajorKey key);

    int insert(Major record);

    int insertSelective(Major record);

    List<Major> selectByExample(MajorExample example);
    
    List<Major> selectMidAndNameByCid(String cid);
    
    List<Major> selectMidAndName();
    
    Major selectByPrimaryKey(MajorKey key);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByPrimaryKeySelective(Major record);

    int updateByPrimaryKey(Major record);
}