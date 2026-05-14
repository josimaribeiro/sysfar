package br.com.sistema.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.sistema.model.LogExecucao;
import br.com.sistema.repository.LogExecucaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDateTime;

@Component
public class Inicializador implements CommandLineRunner {

    @Autowired
    private LogExecucaoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        LogExecucao log = repository.findFirstByOrderByIdAsc()
                .orElse(new LogExecucao());
        log.setDataHora(LocalDateTime.now());
        repository.save(log);
    }
}
