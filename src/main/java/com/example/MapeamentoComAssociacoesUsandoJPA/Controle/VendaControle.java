package com.example.MapeamentoComAssociacoesUsandoJPA.Controle;

import com.example.MapeamentoComAssociacoesUsandoJPA.Modelo.Entity.Venda;
import com.example.MapeamentoComAssociacoesUsandoJPA.Repositorio.VendaRepositorio;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

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

    @PostMapping("/filtrar")
    public ModelAndView filtrar(Model model, @RequestParam(value = "data", required = false) LocalDate data,
                                @RequestParam(required = false) Integer clienteId) {
        if (data == null) {
            return (clienteId != null)
                    ? new ModelAndView("redirect:/vendas/cliente/" + clienteId)
                    : new ModelAndView("redirect:/vendas");
        }
        if(clienteId != null) {
            model.addAttribute("clienteId", clienteId);
            model.addAttribute("vendas", vendaRepositorio.buscarPorData(data, clienteId));
        }
        else
            model.addAttribute("vendas", vendaRepositorio.buscarPorData(data));

        return new ModelAndView("vendas/list");
    }
    @GetMapping("cliente/{id}")
    public ModelAndView vendasPorCliente(@PathVariable int id, Model model) {
        model.addAttribute("clienteId", id);
        model.addAttribute("vendas", vendaRepositorio.buscarPorCliente(id));
        return new ModelAndView("vendas/list");
    }
}
