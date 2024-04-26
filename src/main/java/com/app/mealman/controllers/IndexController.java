package com.app.mealman.controllers;

import com.app.mealman.dto.SampleDto;
import com.app.mealman.dto.UserDto;
import com.app.mealman.entities.Sample;
import com.app.mealman.entities.User;
import com.app.mealman.services.SampleService;
import com.app.mealman.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    @Autowired
    UserService userService;

    @Autowired
    SampleService sampleService;

    @GetMapping("/")
    String index() {
        return "Hello World";
    }

    @PostMapping("sample")
    @CrossOrigin(origins = "http://localhost:4200")
    Sample testCall(@RequestBody SampleDto sample) {
        String text = sample.getText();
        return sampleService.insertText(text);
    }

    @PostMapping("register_user")
    User registerUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }
}
