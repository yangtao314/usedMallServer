package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.UserInforMation;
import com.example.usedmallserver.entity.UserInforMationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserInforMationMapper {
    int countByExample(UserInforMationExample example);

    int deleteByExample(UserInforMationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserInforMation record);

    int insertSelective(UserInforMation record);

    List<UserInforMation> selectByExample(UserInforMationExample example);

    UserInforMation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserInforMation record, @Param("example") UserInforMationExample example);

    int updateByExample(@Param("record") UserInforMation record, @Param("example") UserInforMationExample example);

    int updateByPrimaryKeySelective(UserInforMation record);

    int updateByPrimaryKey(UserInforMation record);
}