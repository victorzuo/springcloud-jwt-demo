package com.example.service;

import org.springframework.stereotype.Service;

import com.example.JwtUtils;


@Service
public class AuthService {
    public String generateToken(String username) {
        return JwtUtils.generateToken(username);
    }
}