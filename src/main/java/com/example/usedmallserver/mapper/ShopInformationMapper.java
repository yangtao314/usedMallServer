package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.ShopInformation;
import com.example.usedmallserver.entity.ShopInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopInformationMapper {
    int countByExample(ShopInformationExample example);

    int deleteByExample(ShopInformationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopInformation record);

    int insertSelective(ShopInformation record);

    List<ShopInformation> selectByExample(ShopInformationExample example);

    ShopInformation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopInformation record, @Param("example") ShopInformationExample example);

    int updateByExample(@Param("record") ShopInformation record, @Param("example") ShopInformationExample example);

    int updateByPrimaryKeySelective(ShopInformation record);

    int updateByPrimaryKey(ShopInformation record);
}