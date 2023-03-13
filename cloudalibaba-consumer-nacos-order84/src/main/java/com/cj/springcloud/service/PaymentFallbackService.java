package com.cj.springcloud.service;

import com.cj.springcloud.entities.CommonResult;
import com.cj.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author cj
 * @date 2023/3/11 13:58
 * @description
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回---PaymentFallbackService", new Payment(id,"errorSerial"));
    }
}
