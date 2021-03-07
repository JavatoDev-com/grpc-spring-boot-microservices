package com.javatodev.grpcmicroserviceb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GrpcMicroserviceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcMicroserviceBApplication.class, args);
    }

}
