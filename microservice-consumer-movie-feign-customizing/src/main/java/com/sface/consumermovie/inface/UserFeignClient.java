package com.sface.consumermovie.inface;

import com.sface.consumermovie.config.FeignConfiguration;
import com.sface.consumermovie.domain.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
public interface UserFeignClient {

    @RequestLine("GET /{id}")//{id}如果没有加{}会报405
    public User findById(@Param("id") Long id);//如果没有改成@Param会报404
}
