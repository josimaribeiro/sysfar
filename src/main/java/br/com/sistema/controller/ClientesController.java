package br.com.sistema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import br.com.sistema.model.Clientes;
import br.com.sistema.repository.ClientesRepository;

@Controller
public class ClientesController {

    @Autowired
    private ClientesRepository repository;

    // Exibe o formulário
    @GetMapping("/clientes/cadastrar")
    public String mostrarFormulario(Model model) {
        model.addAttribute("cliente", new Clientes());
        return "clientes/cadastrar";
    }

    // Recebe o POST do formulário
    @PostMapping("/clientes/cadastrar")
    public String salvarCliente(@ModelAttribute Clientes cliente) {
        repository.save(cliente);
        return "redirect:/clientes/cadastrar?sucesso";
    }
    
    
    @GetMapping("/clientes/consultar")
    public String consultarClientes(Model model) {
        model.addAttribute("clientes", repository.findAll());
        return "clientes/consultar";
    }
    
    
}


