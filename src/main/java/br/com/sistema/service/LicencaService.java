package br.com.sistema.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sistema.model.Licenca;
import br.com.sistema.repository.LicencaRepository;
import br.com.sistema.utils.CryptoUtil;

@Service
public class LicencaService {

    @Autowired
    private LicencaRepository licencaRepository;

    @Autowired
    private CryptoUtil cryptoUtil; // utilitário para criptografia

    public LocalDate buscarDataUltimaAutenticacao() {
        Licenca licenca = licencaRepository.findTopByOrderByIdDesc()
                .orElseThrow(() -> new RuntimeException("Nenhuma licença encontrada"));

        String dataDescriptografada = cryptoUtil.decrypt(licenca.getDataAutenticacaoCriptografada());
        return LocalDate.parse(dataDescriptografada); // formato ISO yyyy-MM-dd
    }
}
