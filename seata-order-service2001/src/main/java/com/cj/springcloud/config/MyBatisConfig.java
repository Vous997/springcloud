package com.cj.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cj
 * @date 2023/3/11 16:14
 * @description
 */
@Configuration
@MapperScan({"com.cj.springcloud.dao"})
public class MyBatisConfig {
}
