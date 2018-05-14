package com.lee.userservice.controller;

import com.lee.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${userServiceVariable}")
    private String userServiceVariable;

    @Value("${spring.zipkin.base-url}")
    private String zipkinBaseUrl;

    @RequestMapping("/test")
    public String test(@RequestParam String name) {
        return "hi "+name+", variable :" + userServiceVariable + " i am from port:" + port + "--------" + zipkinBaseUrl + "------";
    }

}
