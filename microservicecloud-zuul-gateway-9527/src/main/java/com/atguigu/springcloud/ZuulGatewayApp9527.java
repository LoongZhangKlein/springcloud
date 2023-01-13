package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */
@SpringBootApplication
// Zuul配置
@EnableZuulProxy
public class ZuulGatewayApp9527 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulGatewayApp9527.class,args);
        System.out.println("ZuulGatewayApp9527启动成功!");
    }
}