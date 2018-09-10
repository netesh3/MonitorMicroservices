package com.emp.service.app.empserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmpserviceappApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpserviceappApplication.class, args);
    }
}
