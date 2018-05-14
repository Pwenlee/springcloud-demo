package com.lee.usercontroller.controller;

import com.lee.usercontroller.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserService userService;

    @Value("${spring.zipkin.base-url}")
    private String zipkinBaseUrl;

    @RequestMapping(value = "/test")
    String test(@RequestParam(value = "name") String name){
        return userService.test(name) + zipkinBaseUrl + "--------------";
    }

}
