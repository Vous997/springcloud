package com.cj.springcloud.service.Impl;

import com.cj.springcloud.dao.PaymentDao;
import com.cj.springcloud.entities.Payment;
import com.cj.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author cj
 * @date 2023/1/27 10:05
 * @description
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    //java自带自动注入，@Autowired是spring的
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}
