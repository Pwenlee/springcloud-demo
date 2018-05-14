package com.lee.usercontroller.hystrix;

import com.lee.usercontroller.feign.service.UserService;
import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrixFallBack implements UserService {

    @Override
    public String test(String name) {
        return null;
    }

    @Override
    public long getTotalUserCount() {
        return 0;
    }

}
