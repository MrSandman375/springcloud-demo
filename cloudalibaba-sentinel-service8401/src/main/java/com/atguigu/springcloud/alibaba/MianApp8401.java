package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author Fan
 * @Date 2020/8/3
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class MianApp8401 {
    public static void main(String[] args) {
        SpringApplication.run(MianApp8401.class,args);
    }
}
