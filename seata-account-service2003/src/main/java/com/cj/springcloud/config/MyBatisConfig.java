package com.cj.springcloud.config;

/**
 * @author cj
 * @date 2023/3/11 19:33
 * @description
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.cj.springcloud.dao"})
public class MyBatisConfig {
}
