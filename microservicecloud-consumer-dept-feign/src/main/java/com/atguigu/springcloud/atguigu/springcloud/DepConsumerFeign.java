package com.atguigu.springcloud.atguigu.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 开启eureka客户端

@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan("com.atguigu.springcloud")
public class DepConsumerFeign {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DepConsumerFeign.class, args);
        System.out.println("访问端口"+run.getId());
        System.out.println("DepConsumerFeign启动成功 o(∩_∩)o");

    }
}