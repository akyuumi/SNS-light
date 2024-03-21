package com.app.mealman.controllers;

import com.app.mealman.dto.UserDto;
import com.app.mealman.entities.User;
import com.app.mealman.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    String index() {
        return "Hello World";
    }

    @PostMapping("register_user")
    User registerUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
