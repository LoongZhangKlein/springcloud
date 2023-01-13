package com.atguigu.springcloud;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2023-01-13-16:53
 */
@RestController
public class ConfigClientRest {
    @Value("${spring.application.name}")
    private String applicationName;
//    @Value("${eureka.client.service-url.defaultZone}")
//    private String eurekaServers;
    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig() {
        String str = "applicationName: " + applicationName + "\t eurekaServers;" + "eurekaServers" + "port:" + port;
        System.out.println("***x**str:" + str);
        return "applicationName: " + applicationName + "\t eurekaServers:" + "eurekaServers" + "\t port: " + port;
    }
}
