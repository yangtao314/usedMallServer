package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.GoodsOfOrderForm;
import com.example.usedmallserver.entity.GoodsOfOrderFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GoodsOfOrderFormMapper {
    int countByExample(GoodsOfOrderFormExample example);

    int deleteByExample(GoodsOfOrderFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOfOrderForm record);

    int insertSelective(GoodsOfOrderForm record);

    List<GoodsOfOrderForm> selectByExample(GoodsOfOrderFormExample example);

    GoodsOfOrderForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GoodsOfOrderForm record, @Param("example") GoodsOfOrderFormExample example);

    int updateByExample(@Param("record") GoodsOfOrderForm record, @Param("example") GoodsOfOrderFormExample example);

    int updateByPrimaryKeySelective(GoodsOfOrderForm record);

    int updateByPrimaryKey(GoodsOfOrderForm record);
}