package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */
@SpringBootApplication
@EnableEurekaServer
public class MicroServiceCloudConfigEurekaClient7001 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConfigEurekaClient7001.class, args);

        System.out.println("MicroServiceCloudConfigEurekaClient7001启动成功!");
    }
}