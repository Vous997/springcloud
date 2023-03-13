package com.cj.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author cj
 * @date 2023/2/3 17:50
 * @description
 */
public interface LoadBalancer {
    ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
