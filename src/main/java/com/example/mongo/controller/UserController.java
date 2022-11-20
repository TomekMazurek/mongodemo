package com.example.mongo.controller;

import com.example.mongo.model.User;
import com.example.mongo.model.UserDto;
import com.example.mongo.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping("/{name}")
    public User findUserByName(@RequestParam String name) {
        return userService.findUserByName(name);
    }

    @GetMapping
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }
}
