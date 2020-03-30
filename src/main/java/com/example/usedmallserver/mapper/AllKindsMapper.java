package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.AllKinds;
import com.example.usedmallserver.entity.AllKindsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AllKindsMapper {
    int countByExample(AllKindsExample example);

    int deleteByExample(AllKindsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AllKinds record);

    int insertSelective(AllKinds record);

    List<AllKinds> selectByExample(AllKindsExample example);

    AllKinds selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AllKinds record, @Param("example") AllKindsExample example);

    int updateByExample(@Param("record") AllKinds record, @Param("example") AllKindsExample example);

    int updateByPrimaryKeySelective(AllKinds record);

    int updateByPrimaryKey(AllKinds record);
}