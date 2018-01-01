package com.deman.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @RequestMapping(value = "/aop")
    public Object aopTest(String key){
        return "key: " + key;
    }

    @RequestMapping(value = "/testAround")
    public Object testAround(String key){
        return "key: " + key;
    }
}
