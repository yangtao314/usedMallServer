package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.UserState;
import com.example.usedmallserver.entity.UserStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserStateMapper {
    int countByExample(UserStateExample example);

    int deleteByExample(UserStateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserState record);

    int insertSelective(UserState record);

    List<UserState> selectByExample(UserStateExample example);

    UserState selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByExample(@Param("record") UserState record, @Param("example") UserStateExample example);

    int updateByPrimaryKeySelective(UserState record);

    int updateByPrimaryKey(UserState record);
}