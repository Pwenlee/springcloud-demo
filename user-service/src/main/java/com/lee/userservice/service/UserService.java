package com.lee.userservice.service;

import com.lee.api.IUserService;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Override
    public long getTotalUserCount() {
        return 0;
    }

}
