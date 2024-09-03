package com.shan.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author: Steven
 * @Date: 2024/8/28
 * @Time: 下午3:10
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.shan.cloud.mapper") //import tk.mybatis.spring.annotation.MapperScan;
//@EnableDiscoveryClient
@RefreshScope // 动态刷新
public class Main8001
{
    public static void main(String[] args)
    {
        SpringApplication.run(Main8001.class,args);
    }
}
