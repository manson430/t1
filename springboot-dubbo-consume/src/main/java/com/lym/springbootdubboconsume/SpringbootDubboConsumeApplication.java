package com.lym.springbootdubboconsume;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@EnableDubbo
@SpringBootApplication
public class SpringbootDubboConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboConsumeApplication.class, args);
    }

}
