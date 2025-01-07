package com.example.demo.services;

import com.example.demo.objects.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> getAll(){
        return repository.findAll();
    }
}
