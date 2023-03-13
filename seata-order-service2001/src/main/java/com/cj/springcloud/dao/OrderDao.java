package com.cj.springcloud.dao;

import com.cj.springcloud.domain.Order;
import feign.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author cj
 * @date 2023/3/11 16:11
 * @description
 */
@Mapper
public interface OrderDao {

    /**
     * 创建订单
     */
    void create(Order order);

    /**
     * 修改订单金额
     */
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
