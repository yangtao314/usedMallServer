package com.example.usedmallserver.server.impl;

import com.example.usedmallserver.entity.GoodsCar;
import com.example.usedmallserver.entity.GoodsCarExample;
import com.example.usedmallserver.mapper.GoodsCarMapper;
import com.example.usedmallserver.server.GoodsCarServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsCarServerImpl implements GoodsCarServer {

    @Autowired
    private GoodsCarMapper goodsCarMapper;

    @Override
    public List<GoodsCar> getGoodsCars() {
        GoodsCarExample carExample = new GoodsCarExample();
//        GoodsCarExample.Criteria criteria = carExample.createCriteria();
        return goodsCarMapper.selectByExample(carExample);
    }
}
