package com.lym.springbootdubboprovide.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.lym.springbootdubbopublic.service.IDemoService;
import org.springframework.stereotype.Component;

@Component
@Service
public class DemoService implements IDemoService {
    @Override
    public String SayHello(String u) {
        return "hello my baby ->" + u;
    }
}
