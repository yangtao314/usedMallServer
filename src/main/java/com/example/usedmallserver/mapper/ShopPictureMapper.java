package com.example.usedmallserver.mapper;

import com.example.usedmallserver.entity.ShopPicture;
import com.example.usedmallserver.entity.ShopPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopPictureMapper {
    int countByExample(ShopPictureExample example);

    int deleteByExample(ShopPictureExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopPicture record);

    int insertSelective(ShopPicture record);

    List<ShopPicture> selectByExample(ShopPictureExample example);

    ShopPicture selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopPicture record, @Param("example") ShopPictureExample example);

    int updateByExample(@Param("record") ShopPicture record, @Param("example") ShopPictureExample example);

    int updateByPrimaryKeySelective(ShopPicture record);

    int updateByPrimaryKey(ShopPicture record);
}