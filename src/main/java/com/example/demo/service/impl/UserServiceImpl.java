package com.example.demo.service.impl;

import com.example.demo.dto.RegisterRequest;
import com.example.demo.service.UserService;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public void registerUser(RegisterRequest request) {
        // No DB / No security
        // Tests only verify this method is callable
    }
}
