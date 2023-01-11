package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @param
 * @author 123
 * @return
 * @title
 * @date 2023/1/9 9:59
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentAlibaba9001 {
    public static void main(String[] args) {
        SpringApplication.run(PaymentAlibaba9001.class, args);
    }
}
