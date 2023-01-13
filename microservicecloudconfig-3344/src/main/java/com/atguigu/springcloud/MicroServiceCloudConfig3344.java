package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author loongzhang
 * @Description DOING
 * @date ${DATE}-${TIME}
 */
@SpringBootApplication
// 可以开启应用服务对配置中心的支持。
@EnableConfigServer
public class MicroServiceCloudConfig3344 {
    public static void main(String[] args) {
        SpringApplication.run(MicroServiceCloudConfig3344.class,args);
        System.out.println("MicroServiceCloudConfig3344 启动成功");
    }
}