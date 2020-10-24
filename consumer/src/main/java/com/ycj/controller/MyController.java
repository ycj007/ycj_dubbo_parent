package com.ycj.controller;

import com.ycj.service.MyService;
import org.apache.dubbo.config.spring.beans.factory.config.DubboConfigDefaultPropertyValueBeanPostProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private MyService myService;
    DubboConfigDefaultPropertyValueBeanPostProcessor beanPostProcessor;

    @RequestMapping("/say/{name}")
    public String say(@PathVariable String name) {
        return myService.sayHello(name);
    }

}
