package com.annyni.tasklist.service;

import com.annyni.tasklist.web.dto.auth.JwtRequest;
import com.annyni.tasklist.web.dto.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
