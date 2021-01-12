package com.st;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AdapterStarter {
    public static void main(String[] args) {
        SpringApplication.run(AdapterStarter.class, args);
    }
}
