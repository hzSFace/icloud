package com.sface.consumermovie.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

//使用RibbonClient为特定的name指定自定义Ribbon配置
@Configuration
@RibbonClient(name="microservice-provider-user", configuration = MyRibbonConfiguration.class)
public class TestConfiguration {


}
