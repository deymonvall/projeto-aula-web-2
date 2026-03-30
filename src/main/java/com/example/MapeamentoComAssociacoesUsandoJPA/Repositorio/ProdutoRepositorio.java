package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Produto;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProdutoRepositorio {
    @PersistenceContext
    private EntityManager em;

    public void insere(Produto produto) {
        em.persist(produto);
    }

    public void excluir(long id) {
        Produto produto = em.find(Produto.class, id);
    }

    public Produto buscar(long id) {
        return em.find(Produto.class, id);
    }

    public List<Produto> buscarTodos() {
        return em.createQuery("select v from Venda v", Produto.class).getResultList();
    }

    public void atualizar(Produto produto) {
        em.merge(produto);
    }
}
