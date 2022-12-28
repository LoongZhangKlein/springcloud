package com.atguigu.springcloud;

import com.atguigu.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// 开启eureka客户端
@EnableEurekaClient
/**
 * 此处eureka名字不能写错  同eureka服务名字
 */
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DepConsumer80 {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DepConsumer80.class, args);
        System.out.println("访问端口"+run.getId());
        System.out.println("DepConsumer80启动成功 o(∩_∩)o");

    }
}