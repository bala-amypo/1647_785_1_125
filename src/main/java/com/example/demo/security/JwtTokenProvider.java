package com.example.demo.security;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

@Component
public class JwtTokenProvider {

    /**
     * Generates a dummy JWT token.
     * Replace with actual JWT generation logic later.
     */
    public String generateToken(Authentication authentication) {
        // You can cast authentication.getPrincipal() to your UserDetails if needed
        return "dummy-jwt-token";
    }
}
