package com.sface.provideruser.controller;

import com.sface.provideruser.dao.UserRepository;
import com.sface.provideruser.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id){
         User user = userRepository.getOne(id);
         return user;
    }
}
