package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author loongzhang
 * @Description DOING
 * @date 2022-12-28-22:22
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule iRule(){
        //return new RandomRule();
        return new RandomRule_ZL();
    }
}
