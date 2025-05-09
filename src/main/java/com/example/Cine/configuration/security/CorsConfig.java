package com.example.Cine.configuration.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Específico para seu frontend Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos explícitos
                .allowedHeaders("Authorization", "Content-Type", "Accept") // Headers específicos
                .allowCredentials(true)
                .maxAge(3600);
    }
}