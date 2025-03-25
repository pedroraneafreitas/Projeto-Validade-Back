package com.example.demo.security;

import com.example.demo.objects.Usuarios.Usuario;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;



public class UserAuthenticated implements UserDetails {

     private final Usuario user;

    public UserAuthenticated(Usuario user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(() -> user.getRole());
    }

    @Override
    public String getPassword() {
        return user.getUsuarioSenha();
    }

    @Override
    public String getUsername() {
        return user.getNomeUsuario();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return user.getAtivo();
    }
}


