package com.example.demo.services;

import com.example.demo.objects.TA_Setor_Item;
import com.example.demo.repository.SetorItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorItemService {
    @Autowired
    private SetorItemRepository repository;

    public List<TA_Setor_Item> getAll(){
        return repository.findAll();
    }
}
