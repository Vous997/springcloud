package com.cj.springcloud.service;

import com.cj.springcloud.domain.Order;

/**
 * @author cj
 * @date 2023/3/11 16:13
 * @description
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);

}
