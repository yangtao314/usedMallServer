package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.AdminOperation;
import com.example.usedmallserver.entity.AdminOperationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminOperationMapper {
    int countByExample(AdminOperationExample example);

    int deleteByExample(AdminOperationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminOperation record);

    int insertSelective(AdminOperation record);

    List<AdminOperation> selectByExample(AdminOperationExample example);

    AdminOperation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminOperation record, @Param("example") AdminOperationExample example);

    int updateByExample(@Param("record") AdminOperation record, @Param("example") AdminOperationExample example);

    int updateByPrimaryKeySelective(AdminOperation record);

    int updateByPrimaryKey(AdminOperation record);
}