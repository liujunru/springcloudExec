package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @param
 * @author 123
 * @return
 * @title
 * @date 2023/1/9 11:43
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigClient3377 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigClient3377.class, args);
    }
}
