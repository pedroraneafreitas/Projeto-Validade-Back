package com.example.demo.services;

import com.example.demo.security.JwtServive;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    private final JwtServive jwtServive;

    public AuthenticationService(JwtServive jwtServive) {
        this.jwtServive = jwtServive;
    }

    public String authentication(Authentication auth){
        return jwtServive.getGenerateToken(auth);
    }

}
