package com.group6.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.group6.blog.mapper")
public class Day16Am20221103Application {

    public static void main(String[] args) {
        SpringApplication.run(Day16Am20221103Application.class, args);
    }

}
