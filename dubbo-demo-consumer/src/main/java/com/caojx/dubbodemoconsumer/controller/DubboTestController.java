package com.caojx.dubbodemoconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.caojx.service.interfaces.ITest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dubboTest")
public class DubboTestController {

    @Reference(check = false)
    private ITest test;

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(String name){
        return test.sayHello(name);
    }
}
