package com.taskmanager.task_management;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(auth -> auth
            		.requestMatchers("/admin/**").hasRole("ADMIN")
            		.requestMatchers("/user/**").hasAnyRole("USER", "ADMIN")
            		.requestMatchers("/tasks/**").hasAnyRole("USER", "ADMIN")
            		.anyRequest().authenticated()
            )
            .httpBasic(basic -> {});

        return http.build();
    }
}