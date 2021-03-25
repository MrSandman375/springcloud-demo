package com.atguigu.springcloud.service;


import org.springframework.stereotype.Component;

/**
 * @Auther: 范人介
 * @Date: 2020/7/12
 * @Description:
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Long id) {
        return "-------PaymentFallbackService fall back-paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Long id) {
        return "-------PaymentFallbackService fall back-paymentInfo_TimeOut";
    }
}
