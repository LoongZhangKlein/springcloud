package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-04-15:33
 */
@SpringBootApplication
// 开启豪猪流量检测
@EnableHystrixDashboard
public class DeptConsumer_DashBoard_App {

    public static void main(String[] args) {
         SpringApplication.run(DeptConsumer_DashBoard_App.class, args);
        System.out.println("DeptConsumer_DashBoard_App 启动成功!!");
    }
}
