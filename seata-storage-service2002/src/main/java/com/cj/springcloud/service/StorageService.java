package com.cj.springcloud.service;

/**
 * @author cj
 * @date 2023/3/11 19:15
 * @description
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}