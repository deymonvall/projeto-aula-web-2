package com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Produto produto;
    private Double quantidade;
    @ManyToOne
    private Venda venda;

    public Item(Long id, Produto produto, Double quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item(Produto produto, Double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Item() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Double getQuantidade() {
        return quantidade;
    }

    public BigDecimal total() {
        return produto.getPreco().multiply(new BigDecimal(quantidade));
    }

    public Item(Long id, Produto produto, Double quantidade, Venda venda) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.venda = venda;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }
}
