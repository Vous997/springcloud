package com.cj.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author cj
 * @date 2023/3/11 19:19
 * @description
 */
@Configuration
@MapperScan({"com.cj.springcloud.dao"})
public class MyBatisConfig {
}
