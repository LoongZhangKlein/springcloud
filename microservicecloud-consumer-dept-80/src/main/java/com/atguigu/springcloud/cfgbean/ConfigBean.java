package com.atguigu.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.Random;

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
    /**
     * 开启负载均衡
     * 此处默认负载均衡策略为轮询策略
     * 该策略在视频中讲解时为刷新,然后依次访问每个数据库,但是实际操作没有达到视频中效果
     */
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
//    @Bean
//    public IRule iRule(){
//        // 达到的目的用我们重新选择的随机算法替代轮询
//        return new RandomRule();
//    }

}
