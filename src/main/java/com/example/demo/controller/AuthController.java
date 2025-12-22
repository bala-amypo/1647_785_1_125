package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.dto.ApiResponse;
import com.example.demo.util.ResponseUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public ApiResponse register(@RequestBody User user) {
        User savedUser = userRepository.save(user);
        return ResponseUtil.success("User registered successfully", savedUser);
    }

    @PostMapping("/login")
    public ApiResponse login(@RequestBody User user) {
        return ResponseUtil.success("Login successful");
    }
}
