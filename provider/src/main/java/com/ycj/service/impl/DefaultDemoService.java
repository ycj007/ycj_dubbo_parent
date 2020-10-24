package com.ycj.service.impl;

import com.alibaba.boot.nacos.config.autoconfigure.NacosConfigApplicationContextInitializer;
import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.ycj.service.DemoService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service(version = "1.0.0", group = "ycj")
public class DefaultDemoService implements DemoService {

    /**
     * The default value of ${dubbo.application.name} is ${spring.application.name}
     */
    @Value("${dubbo.application.name}")
    private String serviceName;
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    public String sayHello(String name) {
        return String.format("[%s] : Hello, %s:%s", serviceName, name, useLocalCache);
    }
}