package com.ycj.service;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Reference(version = "1.0.0", injvm = false, group = "ycj")
    private DemoService demoService;
    @NacosValue(value = "${useLocalCache:false}", autoRefreshed = true)
    private boolean useLocalCache;

    public String sayHello(String name) {

        return demoService.sayHello(useLocalCache + name + "-");
    }
}
