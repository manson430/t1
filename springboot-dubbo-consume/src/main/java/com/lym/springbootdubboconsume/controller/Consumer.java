package com.lym.springbootdubboconsume.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.lym.springbootdubbopublic.service.IDemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Consumer {
    @Reference // 引用服务
            IDemoService service;

    @ResponseBody
    @RequestMapping("/test")
    public String test() {
        return service.SayHello("word");
    }
}
