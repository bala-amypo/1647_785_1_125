package com.example.demo.config;

import io.swagger.v3.oas.config.OpenAPI;
import io.swagger.v3.oas.config.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                // You need to change the port as per your server
                .servers(List.of(
                        new Server().url("https://9005.vs.amypo.ai")
                ));
        }
}
