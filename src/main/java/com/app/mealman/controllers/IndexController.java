package com.app.mealman.controllers;

import com.app.mealman.entities.User;
import com.app.mealman.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    String index() {
        User user = new User();
        user.setUsername("taro");
        user.setEmail("sample@gmail.com");
        userService.createUser(user);
        return "OK";
    }
}
