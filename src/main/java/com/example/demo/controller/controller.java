package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.FacebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/fbuser")@CrossOrigin(origins="*")
public class controller {

    @Autowired
    private FacebookService facebookService;

    @GetMapping()
    public List<User> getAllUsers() {
        return facebookService.getAllUsers();
    }

    @PostMapping
    public User saveUser(@RequestBody User user) {
        return facebookService.saveUser(user);
    }
}
