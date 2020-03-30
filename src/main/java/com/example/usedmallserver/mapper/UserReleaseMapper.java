package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.UserRelease;
import com.example.usedmallserver.entity.UserReleaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserReleaseMapper {
    int countByExample(UserReleaseExample example);

    int deleteByExample(UserReleaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserRelease record);

    int insertSelective(UserRelease record);

    List<UserRelease> selectByExample(UserReleaseExample example);

    UserRelease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserRelease record, @Param("example") UserReleaseExample example);

    int updateByExample(@Param("record") UserRelease record, @Param("example") UserReleaseExample example);

    int updateByPrimaryKeySelective(UserRelease record);

    int updateByPrimaryKey(UserRelease record);
}