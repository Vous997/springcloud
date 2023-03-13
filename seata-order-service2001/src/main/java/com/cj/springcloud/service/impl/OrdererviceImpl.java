package com.cj.springcloud.service.impl;

import com.cj.springcloud.dao.OrderDao;
import com.cj.springcloud.domain.Order;
import com.cj.springcloud.service.AccountService;
import com.cj.springcloud.service.OrderService;
import com.cj.springcloud.service.StorageService;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cj
 * @date 2023/3/11 16:33
 * @description
 */
@Service
@Slf4j
public class OrdererviceImpl implements OrderService {
    @Resource
    private OrderDao orderDao;
    @Resource
    private StorageService storageService;
    @Resource
    private AccountService accountService;

    /**
     * 创建订单->调用库存服务扣减库存->调用账户服务扣减账户余额->修改订单状态
     * 简单说：
     * 下订单->减库存->减余额->改状态
     */
    @Override
    @GlobalTransactional
    public void create(Order order) {
        log.info("---------->开始新建订单");
        //本应用创建订单
        orderDao.create(order);
        //远程调用库存服务扣减库存
        log.info("---------->订单微服务开始调用库存，做扣减Count");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("---------->订单微服务开始调用库存，做扣减结束");
        //远程调用账户服务扣减余额
        log.info("---------->订单微服务开始调用账户，做扣减Money");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("---------->订单微服务开始调用账户，做扣减结束");
        //修改订单状态为已完成
        log.info("---------->开始修改订单");
        orderDao.update(order.getUserId(),0);
        log.info("---------->结束修改订单");

        log.info("----------->下订单结束");

    }
}
