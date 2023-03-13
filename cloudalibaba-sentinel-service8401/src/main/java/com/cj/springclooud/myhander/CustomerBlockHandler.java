package com.cj.springclooud.myhander;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.cj.springcloud.entities.CommonResult;

/**
 * @author cj
 * @date 2023/3/9 20:01
 * @description
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler----1");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler----2");
    }

}
