package com.example.demo3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
//    @Autowired
//    StringRedisTemplate redisTemplate;
    @RequestMapping(value = "hello")
    public String hello(){
//        Long views =  redisTemplate.opsForValue().increment("views");
//        return "hello world,thanksyou views"+views;
        return "hello world 111";
    }
}
