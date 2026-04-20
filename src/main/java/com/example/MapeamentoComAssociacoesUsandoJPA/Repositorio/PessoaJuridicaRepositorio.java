package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.PessoaJuridica;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PessoaJuridicaRepositorio {
    @PersistenceContext
    private EntityManager entityManager;

    public void inserir(PessoaJuridica cliente){
        entityManager.persist(cliente);
    }
    public List<PessoaJuridica> buscarTodos(){
        return entityManager.createQuery("select p from PessoaJuridica p", PessoaJuridica.class).getResultList();
    }

    public List<PessoaJuridica> buscarPorNome(String nome) {
        return entityManager.createQuery("select p from PessoaJuridica p where p.razaoSocial like :nome", PessoaJuridica.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public @Nullable PessoaJuridica buscarPorId(int id) {
        return entityManager.find(PessoaJuridica.class, id);
    }

    public void atualizar(PessoaJuridica cliente) {
        entityManager.merge(cliente);
    }

    public void excluir(int id) {
        PessoaJuridica cliente = buscarPorId(id);
        if (cliente != null) {
            entityManager.remove(cliente);
        }
    }
}
