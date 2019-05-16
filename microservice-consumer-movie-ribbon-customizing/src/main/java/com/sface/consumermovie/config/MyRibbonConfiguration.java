package com.sface.consumermovie.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRibbonConfiguration {

    @Bean
    public IRule ribbonRule(){
        //将负载均衡规则修改为随机
        return new RandomRule();
    }
}
