package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.WantContext;
import com.example.usedmallserver.entity.WantContextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WantContextMapper {
    int countByExample(WantContextExample example);

    int deleteByExample(WantContextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WantContext record);

    int insertSelective(WantContext record);

    List<WantContext> selectByExample(WantContextExample example);

    WantContext selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WantContext record, @Param("example") WantContextExample example);

    int updateByExample(@Param("record") WantContext record, @Param("example") WantContextExample example);

    int updateByPrimaryKeySelective(WantContext record);

    int updateByPrimaryKey(WantContext record);
}