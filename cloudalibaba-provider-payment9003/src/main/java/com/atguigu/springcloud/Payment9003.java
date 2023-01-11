package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @param
 * @author 123
 * @return
 * @title
 * @date 2023/1/9 11:24
 */
@EnableDiscoveryClient
@SpringBootApplication
public class Payment9003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9003.class, args);
    }
}
