package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.ApeciFickinds;
import com.example.usedmallserver.entity.ApeciFickindsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApeciFickindsMapper {
    int countByExample(ApeciFickindsExample example);

    int deleteByExample(ApeciFickindsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApeciFickinds record);

    int insertSelective(ApeciFickinds record);

    List<ApeciFickinds> selectByExample(ApeciFickindsExample example);

    ApeciFickinds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApeciFickinds record, @Param("example") ApeciFickindsExample example);

    int updateByExample(@Param("record") ApeciFickinds record, @Param("example") ApeciFickindsExample example);

    int updateByPrimaryKeySelective(ApeciFickinds record);

    int updateByPrimaryKey(ApeciFickinds record);
}