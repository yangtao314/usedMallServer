package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.ShopContext;
import com.example.usedmallserver.entity.ShopContextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopContextMapper {
    int countByExample(ShopContextExample example);

    int deleteByExample(ShopContextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopContext record);

    int insertSelective(ShopContext record);

    List<ShopContext> selectByExample(ShopContextExample example);

    ShopContext selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopContext record, @Param("example") ShopContextExample example);

    int updateByExample(@Param("record") ShopContext record, @Param("example") ShopContextExample example);

    int updateByPrimaryKeySelective(ShopContext record);

    int updateByPrimaryKey(ShopContext record);
}