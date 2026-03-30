package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class VendaRepositorio {
    @PersistenceContext
    private EntityManager em;

    public void Criar(Venda venda) {
        em.persist(venda);
    }

    public void Atualizar(Venda venda) {
        em.merge(venda);
    }

    public void Excluir(Venda venda) {
        em.remove(venda);
    }

    public Venda buscarPorId(int id) {
        return em.find(Venda.class, id);
    }

    public List<Venda> buscarTodos() {

        return em.createQuery("select v from Venda v", Venda.class).getResultList();
    }
}
