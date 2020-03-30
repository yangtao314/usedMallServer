package com.example.usedmallserver.controller;


import com.example.usedmallserver.server.GoodsCarServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class IndexController {

    @Autowired
    private GoodsCarServer goodsCarServer;


    @RequestMapping("cars")
    public String cars(Map<String,Object> retMap){
        retMap.put("GoodsCar",goodsCarServer.getGoodsCars());
        return "GoodsCar";
    }

}
