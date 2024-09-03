package com.shan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 
 * @author Steven
 * @date 2024/9/2 10:13
 * @version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Main9001 {
    public static void main(String[] args) {
        SpringApplication.run(Main9001.class, args);
    }
}
