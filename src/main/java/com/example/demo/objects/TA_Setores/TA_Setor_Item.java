package com.example.demo.objects.TA_Setores;

import com.example.demo.objects.Itens.Item;
import com.example.demo.objects.Setores.Setor;
import jakarta.persistence.*;

@Entity
@Table(name = "TA_Setor_Item")
public class TA_Setor_Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantidade")
    private Integer qtd;

    @Column(name = "emEstoque")
    private Integer emEstoque;

    @Column(name = "venceu")
    private Integer vencido;

    @Column(name = "finalizado")
    private  Integer acabou;

    @ManyToOne
    @JoinColumn(name = "fkSetor")
    private Setor setor;

    @ManyToOne
    @JoinColumn(name = "fkItem")
    private Item item;



}
