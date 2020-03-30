package com.example.usedmallserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.usedmallserver.mapper")
public class UsedmallserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsedmallserverApplication.class, args);
    }

}
