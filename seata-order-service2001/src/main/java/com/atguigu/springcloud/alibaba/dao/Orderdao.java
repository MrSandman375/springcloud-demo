package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author Fan
 * @Date 2020/8/13
 * @Description:
 */
@Mapper
public interface Orderdao {

    //新建订单
    void create(Order order);

    //修改订单状态，从0改为1
    void update(@Param("userId") Long id,@Param("status") Integer status);
}
