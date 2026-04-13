package com.example.MapeamentoComAssociacoesUsandoJPA.Controle;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Item;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Produto;
import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio.VendaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Transactional
@Controller
@RequestMapping("/vendas")
public class VendaControle {
    @Autowired
    VendaRepositorio vendaRepositorio;

    @GetMapping("")
    public ModelAndView lista(Model model) {
        model.addAttribute("vendas", vendaRepositorio.buscarTodos());
        return new ModelAndView("vendas/list");
    }

    @GetMapping("/detalhes/{id}")
    public ModelAndView detalhes(@PathVariable int id, Model model) {
        Venda venda = vendaRepositorio.buscarPorId(id);
        model.addAttribute("venda", venda);
        return new ModelAndView("vendas/detail");
    }
}
