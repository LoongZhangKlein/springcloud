package com.atguigu.springcloud.cfgbean;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-18-19:23
 */
//@Configuration
public class ConfigBean {

    /**
     * 此处使用单例模式创建ConfigBean
     */
    private RestTemplate restTemplate;
    private ConfigBean(){}
    public RestTemplate getRestTemplate(){
        if (restTemplate==null){
            synchronized (ConfigBean.class){
                if (restTemplate==null){
                    restTemplate=new RestTemplate();
                }
            }
        }
        return restTemplate;
    }
}
