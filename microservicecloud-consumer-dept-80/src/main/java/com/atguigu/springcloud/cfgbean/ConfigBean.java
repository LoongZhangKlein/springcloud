package com.atguigu.springcloud.cfgbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-19:23
 */
@Configuration
public class ConfigBean {

    /**
     * 此处使用单例模式创建ConfigBean
     */
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
