package com.annyni.tasklist.service.impl;

import com.annyni.tasklist.service.AuthService;
import com.annyni.tasklist.web.dto.auth.JwtRequest;
import com.annyni.tasklist.web.dto.auth.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl  implements AuthService {
    @Override
    public JwtResponse login(JwtRequest loginRequest) {
        return null;
    }

    @Override
    public JwtResponse refresh(String refreshToken) {
        return null;
    }
}
