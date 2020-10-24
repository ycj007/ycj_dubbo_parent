package com.ycj;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@NacosPropertySource(dataId = "example", autoRefreshed = true)
@DubboComponentScan(basePackages = "com.ycj.service")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }
}
