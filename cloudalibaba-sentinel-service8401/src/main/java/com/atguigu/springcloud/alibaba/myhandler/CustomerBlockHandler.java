package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;
import com.atguigu.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author Fan
 * @Date 2020/8/11
 * @Description:
 */
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException ex){
        return new CommonResult(444,"按照客户自定义，global handlerException----1");
    }
    public static CommonResult handlerException2(BlockException ex){
        return new CommonResult(444,"按照客户自定义，global handlerException----2");
    }
}

