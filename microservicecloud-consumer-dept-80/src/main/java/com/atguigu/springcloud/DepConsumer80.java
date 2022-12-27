package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DepConsumer80 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DepConsumer80.class, args);
        System.out.println("访问端口"+run.getId());
        System.out.println("DepConsumer80启动成功 o(∩_∩)o");

    }
}