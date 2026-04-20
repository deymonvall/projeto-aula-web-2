package com.example.MapeamentoComAssociacoesUsandoJPA.Controle;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Pessoa;
import com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio.PessoaFisicaRepositorio;
import com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio.PessoaJuridicaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Controller
@RequestMapping("clientes")
public class ClienteControle {
    @Autowired
    PessoaFisicaRepositorio pessoaFisicaRepositorio;
    @Autowired
    private PessoaJuridicaRepositorio pessoaJuridicaRepositorio;

    @GetMapping("lista")
    public ModelAndView lista(Model model) {
        List<Pessoa> clientes = new ArrayList<>(pessoaFisicaRepositorio.buscarTodos());
        clientes.addAll(pessoaJuridicaRepositorio.buscarTodos());
        model.addAttribute("clientes", clientes);
        return new ModelAndView("clientes/list");
    }
    @PostMapping("filtrar")
    public ModelAndView filtrar(@RequestParam String nome, Model model){
        List<Pessoa> clientes = new ArrayList<>(pessoaFisicaRepositorio.buscarPorNome(nome));
        clientes.addAll(pessoaJuridicaRepositorio.buscarPorNome(nome));

        model.addAttribute("clientes", clientes);
        return new ModelAndView("clientes/list");
    }
}
