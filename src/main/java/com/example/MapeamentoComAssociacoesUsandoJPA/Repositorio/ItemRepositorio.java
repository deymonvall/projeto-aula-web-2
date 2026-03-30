package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class ItemRepositorio {
    @PersistenceContext
    private EntityManager em;

    public Venda buscaVendaPorId(long id) {
        return em.find(Venda.class, id);
    }
}
