package com.example.demo.controllers;

import com.example.demo.objects.Setores.Setor;
import com.example.demo.services.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setores")
public class SetorController {
    @Autowired
    private SetorService service;
    @GetMapping
    public ResponseEntity<List<Setor>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
