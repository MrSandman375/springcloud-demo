package com.atguigu.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @Author Fan
 * @Date 2020/8/13
 * @Description:
 */
@Configuration
@MapperScan({"com.atguigu.springcloud.alibaba.dao"})
public class MybatisConfig {
}
