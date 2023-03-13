package com.cj.springcloud.service;

import com.cj.springcloud.entities.CommonResult;
import com.cj.springcloud.entities.Payment;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author cj
 * @date 2023/2/13 22:04
 * @description
 */
@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) ;

    @GetMapping(value = "/payment/feign/timeout")
    public String paymentFeignTimeout();
}
