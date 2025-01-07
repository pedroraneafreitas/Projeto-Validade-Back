//package com.example.demo.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig {
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
//        http.csrf(csrf -> csrf.disable())
//                .authorizeHttpRequests((request) -> request
//                        .requestMatchers(HttpMethod.GET, "/**").permitAll()
//                        .requestMatchers(HttpMethod.POST, "/**").permitAll()
//                        .requestMatchers(HttpMethod.PUT, "/**").permitAll()
//                        .requestMatchers(HttpMethod.PATCH, "/**").permitAll()
//                        .requestMatchers(HttpMethod.DELETE, "/**").permitAll()
//                        .requestMatchers("/swagger-ui.html", "/swagger-ui/**", "/v3/api-docs").permitAll());
//            return http.build();
//    }
//}
