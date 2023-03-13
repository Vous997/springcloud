package com.cj.springcloud.service;

import com.cj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author cj
 * @date 2023/1/27 10:04
 * @description
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
