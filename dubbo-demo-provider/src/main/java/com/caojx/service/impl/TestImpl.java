package com.caojx.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.caojx.service.interfaces.ITest;

@Service
public class TestImpl implements ITest {

    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
