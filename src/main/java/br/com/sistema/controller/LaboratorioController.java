package br.com.sistema.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.sistema.model.Laboratorio;
import br.com.sistema.repository.LaboratorioRepository;
import jakarta.validation.Valid;

@Controller
@RequestMapping("/laboratorios")
public class LaboratorioController {

    private final LaboratorioRepository laboratorioRepository;

    public LaboratorioController(LaboratorioRepository laboratorioRepository) {
        this.laboratorioRepository = laboratorioRepository;
    }

    // GET → mostra o formulário
    @GetMapping("/cadastrar")
    public String cadastrarForm(Model model) {
        model.addAttribute("laboratorio", new Laboratorio());
        return "laboratorios/cadastrar"; // templates/laboratorios/cadastrar.html
    }

    // POST → salva os dados
    @PostMapping("/cadastrar")
    public String salvar(@Valid @ModelAttribute Laboratorio laboratorio,
                         BindingResult result) {
        if (result.hasErrors()) {
            return "laboratorios/cadastrar";
        }
        laboratorioRepository.save(laboratorio);
        return "redirect:/laboratorios/consultar";
    }

    @GetMapping("/consultar")
    public String consultar(Model model) {
        model.addAttribute("laboratorios", laboratorioRepository.findAll());
        return "laboratorios/consultar";
    }
}
