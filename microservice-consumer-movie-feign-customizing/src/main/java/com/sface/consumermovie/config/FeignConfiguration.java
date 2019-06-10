package com.sface.consumermovie.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;

/**
 * @className FeignConfiguration
 * @Desc Feign配置类，不能使用@Configuration注解，如果加了该注解，那么该类不能放在主应用程序上下文@ComponentScan所扫描的包中
 * @Author HZ
 * @Date 2019/6/10 23:42
 * @Version 1.0
 */
public class FeignConfiguration {

    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
