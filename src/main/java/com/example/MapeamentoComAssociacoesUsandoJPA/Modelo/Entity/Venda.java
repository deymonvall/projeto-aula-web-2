package com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime data;
    @OneToMany(mappedBy = "venda")
    private List<Item> itensVenda;
    @ManyToOne
    private Pessoa pessoa;

    public Venda(Long id, LocalDateTime data, List<Item> itensVenda) {
        this.id = id;
        this.data = data;
        this.itensVenda = itensVenda;
    }

    public Venda(List<Item> itensVenda, LocalDateTime data, Long id) {
        this.itensVenda = itensVenda;
        this.data = data;
        this.id = id;
    }

    public List<Item> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(List<Item> itensVenda) {
        this.itensVenda = itensVenda;
    }

    public Venda(Long id, LocalDateTime data) {
        this.id = id;
        this.data = data;
    }

    public Venda(LocalDateTime data) {
        this.data = data;
    }

    public Venda() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public BigDecimal total() {
        BigDecimal total = new BigDecimal(0);
        for (Item item : itensVenda) {
            total = total.add(item.total());
        }
        return total;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
}
