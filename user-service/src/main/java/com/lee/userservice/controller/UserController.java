package com.lee.userservice.controller;

import com.lee.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/getTotalUserCount")
    public long getTotalUserCount() {
        return  userService.getTotalUserCount();
    }
}
