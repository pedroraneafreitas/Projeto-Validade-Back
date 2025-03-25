package com.example.demo.services;

import com.example.demo.objects.Setores.Setor;
import com.example.demo.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {
    @Autowired
    private SetorRepository repository;

    public List<Setor> getAll(){
        return repository.findAll();
    }
}
