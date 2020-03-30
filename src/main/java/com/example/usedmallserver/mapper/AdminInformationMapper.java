package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.AdminInformation;
import com.example.usedmallserver.entity.AdminInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdminInformationMapper {
    int countByExample(AdminInformationExample example);

    int deleteByExample(AdminInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AdminInformation record);

    int insertSelective(AdminInformation record);

    List<AdminInformation> selectByExample(AdminInformationExample example);

    AdminInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AdminInformation record, @Param("example") AdminInformationExample example);

    int updateByExample(@Param("record") AdminInformation record, @Param("example") AdminInformationExample example);

    int updateByPrimaryKeySelective(AdminInformation record);

    int updateByPrimaryKey(AdminInformation record);
}