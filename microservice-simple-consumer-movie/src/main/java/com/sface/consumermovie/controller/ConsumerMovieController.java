package com.sface.consumermovie.controller;

import com.sface.consumermovie.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerMovieController {
    @Autowired
    private RestTemplate restTemplate;

    @Value("${user.remoteUserServiceUrl}")
    private String remoteUserServiceUrl;

    @GetMapping("/user/{id}")
    public User findUserById(@PathVariable Long id){
        return this.restTemplate.getForObject("http://localhost:8000/"+id, User.class);
    }

    @GetMapping("/userConfig/{id}")
    public User findUserByIdConfig(@PathVariable Long id){
        return this.restTemplate.getForObject(remoteUserServiceUrl+id, User.class);
    }
}
