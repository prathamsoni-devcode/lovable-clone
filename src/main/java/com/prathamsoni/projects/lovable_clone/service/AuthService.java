package com.prathamsoni.projects.lovable_clone.service;

import com.prathamsoni.projects.lovable_clone.dto.auth.AuthResponse;
import com.prathamsoni.projects.lovable_clone.dto.auth.LoginRequest;
import com.prathamsoni.projects.lovable_clone.dto.auth.SignupRequest;

public interface AuthService {
    AuthResponse signup(SignupRequest request);

    AuthResponse login(LoginRequest request);
}
