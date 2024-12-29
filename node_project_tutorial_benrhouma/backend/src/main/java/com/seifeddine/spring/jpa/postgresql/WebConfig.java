package com.seifeddine.spring.jpa.postgresql; // Remplace par ton propre package

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Autorise toutes les routes
                .allowedOrigins("http://localhost:4200") // Autorise le frontend
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Méthodes HTTP autorisées
                .allowedHeaders("*") // Autorise tous les en-têtes
                .allowCredentials(true); // Autorise les cookies/sessions si nécessaire
    }
}
