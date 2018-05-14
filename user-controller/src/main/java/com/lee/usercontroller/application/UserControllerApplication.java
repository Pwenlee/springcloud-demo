package com.lee.usercontroller.application;

import com.lee.usercontroller.feign.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.lee.usercontroller")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.lee.usercontroller.feign.service")
@RestController
@EnableHystrix
@EnableHystrixDashboard
public class UserControllerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserControllerApplication.class, args);
    }


}
