package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.BoughtShop;
import com.example.usedmallserver.entity.BoughtShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BoughtShopMapper {
    int countByExample(BoughtShopExample example);

    int deleteByExample(BoughtShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BoughtShop record);

    int insertSelective(BoughtShop record);

    List<BoughtShop> selectByExample(BoughtShopExample example);

    BoughtShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BoughtShop record, @Param("example") BoughtShopExample example);

    int updateByExample(@Param("record") BoughtShop record, @Param("example") BoughtShopExample example);

    int updateByPrimaryKeySelective(BoughtShop record);

    int updateByPrimaryKey(BoughtShop record);
}