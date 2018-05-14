package com.lee.usercontroller.hystrix;

import com.lee.usercontroller.feign.service.UserService;
import feign.hystrix.FallbackFactory;

public class UserServiceHystrixFallBackFactory implements FallbackFactory<UserService> {

    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public String test(String name) {
                return null;
            }

            @Override
            public long getTotalUserCount() {
                return 0;
            }
        };
    }
}
