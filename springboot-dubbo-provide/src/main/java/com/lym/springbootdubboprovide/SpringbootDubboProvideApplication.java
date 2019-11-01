package com.lym.springbootdubboprovide;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo // 开启 Dubbo
public class SpringbootDubboProvideApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDubboProvideApplication.class, args);
    }

}
