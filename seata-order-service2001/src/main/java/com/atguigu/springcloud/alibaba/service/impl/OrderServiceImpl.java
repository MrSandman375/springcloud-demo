package com.atguigu.springcloud.alibaba.service.impl;

import com.atguigu.springcloud.alibaba.dao.Orderdao;
import com.atguigu.springcloud.alibaba.domain.Order;
import com.atguigu.springcloud.alibaba.service.AccountService;
import com.atguigu.springcloud.alibaba.service.OrderService;
import com.atguigu.springcloud.alibaba.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import javax.annotation.Resource;

/**
 * @Author Fan
 * @Date 2020/8/13
 * @Description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private Orderdao orderdao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    @Override
    @GlobalTransactional(name = "fsp-create-order",rollbackFor = Exception.class)
    public void create(Order order) {

        log.info("-----开始新建订单");
        //新建订单
        orderdao.create(order);

        log.info("-----订单微服务开始调用库存，做扣减count");
        //扣减库存
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("-----订单微服务开始调用库存，做扣减end");

        log.info("-----订单微服务开始调用账户，做扣减Money");
        //扣减账户
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("-----订单微服务开始调用账户，做扣减end");

        //修改订单状态，从零到1，1表示已完成
        log.info("-----修改订单状态开始");
        orderdao.update(order.getUserId(),0);
        log.info("-----修改订单状态结束");

        log.info("-----下订单结束了，O(∩_∩)O");

    }
}
