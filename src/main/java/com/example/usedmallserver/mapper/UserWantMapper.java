package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.UserWant;
import com.example.usedmallserver.entity.UserWantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserWantMapper {
    int countByExample(UserWantExample example);

    int deleteByExample(UserWantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserWant record);

    int insertSelective(UserWant record);

    List<UserWant> selectByExample(UserWantExample example);

    UserWant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserWant record, @Param("example") UserWantExample example);

    int updateByExample(@Param("record") UserWant record, @Param("example") UserWantExample example);

    int updateByPrimaryKeySelective(UserWant record);

    int updateByPrimaryKey(UserWant record);
}