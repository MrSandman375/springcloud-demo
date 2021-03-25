package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Auther: 范人介
 * @Date: 2020/7/9
 * @Description:
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class OrderHysreixMain80 {
    public static void main(String[] args) {

        SpringApplication.run(OrderHysreixMain80.class,args);

    }
}
