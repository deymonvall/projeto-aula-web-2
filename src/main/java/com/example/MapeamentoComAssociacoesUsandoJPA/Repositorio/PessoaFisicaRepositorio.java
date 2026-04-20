package com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Pessoa;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.PessoaFisica;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Produto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.jspecify.annotations.Nullable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PessoaFisicaRepositorio {
    @PersistenceContext
    private EntityManager entityManager;

    public void inserir(PessoaFisica cliente){
        entityManager.persist(cliente);
    }
    public List<PessoaFisica> buscarTodos(){
        return entityManager.createQuery("select p from PessoaFisica p", PessoaFisica.class).getResultList();
    }

    public List<PessoaFisica> buscarPorNome(String nome) {
        return entityManager.createQuery("select p from PessoaFisica p where p.nome like :nome", PessoaFisica.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

    public @Nullable PessoaFisica buscarPorId(int id) {
        return entityManager.find(PessoaFisica.class, id);
    }

    public void atualizar(PessoaFisica cliente) {
        entityManager.merge(cliente);
    }

    public void excluir(int id) {
        PessoaFisica cliente = buscarPorId(id);
        if (cliente != null) {
            entityManager.remove(cliente);
        }
    }
}
