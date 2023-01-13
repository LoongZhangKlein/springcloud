package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-18:27
 */
@SpringBootApplication
// 本地服务启动自动注册进eureka
@EnableEurekaClient
// 启动服务发现
@EnableDiscoveryClient
// 启动熔断服务
@EnableCircuitBreaker
public class DeptProvider8001_Hystrix {
    public static void main(String[] args) {
         SpringApplication.run(DeptProvider8001_Hystrix.class, args);
//        System.out.println("访问端口:"+run.getId());
        System.out.println("DeptProvider8001_Hystrix启动成功");
    }
}
