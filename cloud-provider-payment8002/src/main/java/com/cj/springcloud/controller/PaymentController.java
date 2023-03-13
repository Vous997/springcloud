package com.cj.springcloud.controller;

import com.cj.springcloud.entities.CommonResult;
import com.cj.springcloud.entities.Payment;
import com.cj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author cj
 * @date 2023/1/27 10:11
 * @description
 */
@RestController
@Slf4j
public class PaymentController {
    /**
     * controller--->servcie--->dao
     *
     */

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    //http://localhost:8001/payment/create?serial=777
    @PostMapping(value="/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result=paymentService.create(payment);
        log.info("--------插入结果:"+result+"--------");

        if(result>0){
            return new CommonResult(200,"插入数据库成功,server:"+serverPort,result);
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }

    @GetMapping(value="/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment=paymentService.getPaymentById(id);
        log.info("--------插入结果:"+payment+"--------");

        if(payment != null){
            return new CommonResult(200,"查询成功,server:"+serverPort,payment);
        }else{
            return new CommonResult(444,"查询失败，当前查询id为:"+id,null);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB()
    {
        return serverPort;

    }
}