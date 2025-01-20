package com.example.demo.security;

import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Immutable;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Value("${jwt.public.key}")
    private RSAPublicKey key;

    @Value("${jwt.private.key}")
    private RSAPrivateKey privateKey;

    @Bean
      SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth ->   {

                    List<List<String>> pattern = getListPatterns();

                    //add login aqui
                    auth.requestMatchers("/**").permitAll();
//                     for(int i = 0; i < pattern.size() - 1; i++)
//
//                         for (String endPoint : pattern.get(i)) {
//                             switch (i) {
//                                 case  0:
//                                    auth.requestMatchers(endPoint).hasRole("Funcionario").anyRequest().authenticated();
//                                 case 1:
//                                     auth.requestMatchers(endPoint).hasRole("Lider De Setor").anyRequest().authenticated();
//                                 case 2:
//                                     auth.requestMatchers(endPoint).hasRole("Gerente").anyRequest().authenticated();
//
//                             }

                 // }

                }).httpBasic(Customizer.withDefaults())
                .oauth2ResourceServer(
                        conf -> conf.jwt(Customizer.withDefaults())
                );
            return http.build();
    }

    @Bean
    JwtDecoder jwtDecoder(){
     return NimbusJwtDecoder.withPublicKey(this.key).build();
    }

    @Bean
    JwtEncoder jwtEncoder(){
        var jwk = new RSAKey.Builder(this.key).privateKey(this.privateKey).build();
        var jwks = new ImmutableJWKSet<>(new JWKSet(jwk));
        return new NimbusJwtEncoder(jwks);
    }

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


    public List<List<String>> getListPatterns(){

        List<String> funcionario = List.of();
        List<String> liderDeSetor = List.of();
        List<String> gerente = List.of();

        List<List<String>> retorno = List.of(funcionario, liderDeSetor, gerente);
        return retorno;
    }
}
