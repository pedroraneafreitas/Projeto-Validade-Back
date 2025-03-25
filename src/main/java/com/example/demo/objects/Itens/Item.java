package com.example.demo.objects.Itens;


import jakarta.persistence.*;

@Entity
@Table(name = "item")
public class Item {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "idItem")
   private Long id;

   @Column(name = "itemNome")
   private String name;

   @Column(name = "cdBarras")
   private int cdBarras;

   @Column(name = "precoFornecedor")
    private double precoFornecedor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCdBarras() {
        return cdBarras;
    }

    public void setCdBarras(int cdBarras) {
        this.cdBarras = cdBarras;
    }

    public double getPrecoFornecedor() {
        return precoFornecedor;
    }

    public void setPrecoFornecedor(double precoFornecedor) {
        this.precoFornecedor = precoFornecedor;
    }
}
