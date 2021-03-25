package com.atguigu.springcloud.alibaba.service;

/**
 * @Author Fan
 * @Date 2020/8/13
 * @Description:
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
