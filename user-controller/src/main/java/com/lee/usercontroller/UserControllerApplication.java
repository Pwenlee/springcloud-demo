package com.lee.usercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class UserControllerApplication {

    @Autowired
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(UserControllerApplication.class, args);
    }

    @RequestMapping(value = "/test")
    String test(@RequestParam(value = "name") String name){
        return userService.test(name);
    }
}
