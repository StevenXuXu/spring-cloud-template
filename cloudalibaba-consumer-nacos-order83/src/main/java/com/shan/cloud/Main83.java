package com.shan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Steven
 * @version 1.0
 * @description:
 * @date 2024/9/2 10:25
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class Main83
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main83.class,args);
    }
}
