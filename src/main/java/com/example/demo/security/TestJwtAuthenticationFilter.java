package com.example.demo.security;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TestJwtAuthenticationFilter {

    @Test
    void testFilterCreation() {
        JwtAuthenticationFilter filter = new JwtAuthenticationFilter();
        assertNotNull(filter);
    }
}
