package com.javatodev.grpcmicroservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class GrpcMicroserviceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpcMicroserviceAApplication.class, args);
    }

}
