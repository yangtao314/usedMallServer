package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.UserPassword;
import com.example.usedmallserver.entity.UserPasswordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPasswordMapper {
    int countByExample(UserPasswordExample example);

    int deleteByExample(UserPasswordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    List<UserPassword> selectByExample(UserPasswordExample example);

    UserPassword selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    int updateByExample(@Param("record") UserPassword record, @Param("example") UserPasswordExample example);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);
}