package com.lee.usercontroller.feign.service;

import com.lee.usercontroller.hystrix.UserServiceHystrixFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service", fallback = UserServiceHystrixFallBack.class)
public interface UserService {

    @RequestMapping(value = "/test")
    String test(@RequestParam(value = "name") String name);

    @RequestMapping(value = "/user/getTotalUserCount")
    long getTotalUserCount();
}
