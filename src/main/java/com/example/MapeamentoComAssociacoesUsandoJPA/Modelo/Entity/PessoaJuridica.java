package com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
public class PessoaJuridica extends Pessoa {
    private String razaoSocial;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    private String cnpj;

    @Override
    public String nome() {
        return razaoSocial;
    }

}
