package br.com.sistema.utils;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import java.time.LocalDate;

import br.com.sistema.repository.LicencaRepository;
import br.com.sistema.model.Licenca;

@Component
public class LicencaInitializer implements CommandLineRunner {

    @Autowired
    private LicencaRepository licencaRepository;

    @Override
    public void run(String... args) throws Exception {
        LocalDate hoje = LocalDate.now();
        Licenca licenca = new Licenca();
        licenca.setDataAutenticacaoCriptografada(hoje.toString());
        licencaRepository.save(licenca);
        System.out.println("Licença inicial gravada!");
    }
}
