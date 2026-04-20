package com.example.MapeamentoComAssociacoesUsandoJPA.Controle;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Pessoa;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Produto;
import com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio.ProdutoRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Controller
@RequestMapping("/produtos")
public class ProdutoControle {
    @Autowired
    ProdutoRepositorio produtoRepositorio;

    @GetMapping("/formulario")
    public ModelAndView novo(Model model) {
        Produto produto = new Produto();
        model.addAttribute("produto", produto);
        return new ModelAndView("/produtos/form");
    }

    @GetMapping("/lista")
    public String listar(Model model) throws Exception {
        model.addAttribute("produtos", produtoRepositorio.buscarTodos());
        return "produtos/list";
    }

    @GetMapping("/editar/{id}")
    public ModelAndView edit(@PathVariable int id, ModelMap model) throws Exception {
        model.addAttribute("produto", produtoRepositorio.buscar(id));
        return new ModelAndView("/produtos/form", model);
    }

    @GetMapping("/remover/{id}")
    public ModelAndView remover(@PathVariable int id, ModelMap model) throws Exception {
        produtoRepositorio.excluir(id);
        return new ModelAndView("redirect:/produtos/lista");
    }

    @PostMapping("/salvar")
    public String salvar(Produto produto) throws Exception {
        if (produto.getId() == null)
            produtoRepositorio.insere(produto);
        else
            produtoRepositorio.atualizar(produto);
        return "redirect:/produtos/lista";
    }

    @GetMapping("/criarProduto")
    public String criarProduto(Model model) throws Exception {
        model.addAttribute("produto", new Produto());
        return "produtos/form";
    }
    @PostMapping("filtrar")
    public ModelAndView filtrar(@RequestParam String nome, Model model){
        List<Produto> produtos;
        if(nome.isEmpty())
             produtos = produtoRepositorio.buscarTodos();
        else
            produtos = produtoRepositorio.buscarPorNome(nome);

        model.addAttribute("produtos", produtos);
        return new ModelAndView("produtos/list");
    }
}

