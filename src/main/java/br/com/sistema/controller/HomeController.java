package br.com.sistema.controller;

import br.com.sistema.model.LogExecucao;
import br.com.sistema.repository.LogExecucaoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private final LogExecucaoRepository repository;

    public HomeController(LogExecucaoRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/")
    public String index(Model model) {
        // Busca o único registro de execução
        LogExecucao log = repository.findFirstByOrderByIdAsc().orElse(null);

        // Adiciona ao modelo para Thymeleaf
        model.addAttribute("logExecucao", log);

        return "index"; // carrega templates/index.html
    }
}
