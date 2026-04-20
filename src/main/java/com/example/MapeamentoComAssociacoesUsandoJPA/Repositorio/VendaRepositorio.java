package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

    public List<Venda> buscarPorData(LocalDate data,Integer idCliente) {
        return em.createQuery(
                        "select v from Venda v where v.data >= :inicio and v.data < :fim and v.pessoa.id = :idCliente", Venda.class)
                .setParameter("inicio", data.atStartOfDay())
                .setParameter("fim", data.plusDays(1).atStartOfDay())
                .setParameter("idCliente", idCliente)
                .getResultList();
    }

    public List<Venda> buscarPorCliente(int id) {
        return em.createQuery("select v from Venda v where v.pessoa.id = :id", Venda.class)
                .setParameter("id", id)
                .getResultList();
    }

    public List<Venda> buscarPorData(LocalDate data) {
        return em.createQuery(
                        "select v from Venda v where v.data >= :inicio and v.data < :fim", Venda.class)
                .setParameter("inicio", data.atStartOfDay())
                .setParameter("fim", data.plusDays(1).atStartOfDay())
                .getResultList();
    }
}
