package com.example.demo.controllers;

import com.example.demo.objects.TA_Setores.TA_Setor_Item;
import com.example.demo.services.SetorItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/setor/itens")
public class SetorItemController {
    @Autowired
    private SetorItemService service;


    @GetMapping
    public ResponseEntity<List<TA_Setor_Item>> getAll(){
        return ResponseEntity.ok(service.getAll());
    }
}
