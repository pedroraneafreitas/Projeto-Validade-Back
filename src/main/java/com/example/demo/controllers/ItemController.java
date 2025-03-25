package com.example.demo.controllers;

import com.example.demo.objects.Itens.Item;
import com.example.demo.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService service;
    @GetMapping
     public ResponseEntity<List<Item>> getAll(){

        return ResponseEntity.status(200).body(this.service.getAllItens());
    }
}
