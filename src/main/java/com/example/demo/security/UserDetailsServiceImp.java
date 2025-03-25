package com.example.demo.security;

import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImp implements UserDetailsService {
    @Autowired
    private UsuarioRepository user;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return user.findByNomeUsuario(username)
                .map(UserAuthenticated::new)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não Encontrado"));
    }

    public UserDetails loadUserByLogin(String userName, String userPassword){
        return user.findByNomeUsuarioAndUsuarioSenha(userName, userPassword)
                .map(UserAuthenticated::new)
                .orElseThrow(() -> new UsernameNotFoundException("Usuario não Encontrado"));

    }}
