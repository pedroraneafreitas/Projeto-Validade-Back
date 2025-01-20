package com.example.demo.repository;

import com.example.demo.objects.TA_Setor_Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorItemRepository extends JpaRepository<TA_Setor_Item, Long> {
}
