package com.example.Spring.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        // Disable CSRF: not needed for stateless APIs
        http.csrf(csrf -> csrf.disable());

        // Require authentication on all requests
        http.authorizeHttpRequests(request ->
                request.anyRequest().authenticated()
        );

        // Use HTTP Basic auth (for demo; real apps usually use JWT)
        http.httpBasic(Customizer.withDefaults());

        // Make app stateless: do NOT create or use HTTP sessions
        http.sessionManagement(session ->
                session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        );

        return http.build();
    }
}
