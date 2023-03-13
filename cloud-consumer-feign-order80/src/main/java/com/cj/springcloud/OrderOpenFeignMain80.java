package com.cj.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author cj
 * @date 2023/2/13 22:02
 * @description
 */
@SpringBootApplication
@EnableFeignClients
public class OrderOpenFeignMain80 {
    public static void main(String[] args) {
            SpringApplication.run(OrderOpenFeignMain80.class, args);
    }
}
