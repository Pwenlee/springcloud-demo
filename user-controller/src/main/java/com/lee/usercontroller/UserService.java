package com.lee.usercontroller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "user-service")
public interface UserService {

    @RequestMapping(value = "/test")
    String test(@RequestParam(value = "name") String name);
}
