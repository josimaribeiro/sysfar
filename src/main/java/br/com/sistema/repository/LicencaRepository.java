package br.com.sistema.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sistema.model.Licenca;

@Repository
public interface LicencaRepository extends JpaRepository<Licenca, Long> {
    // supondo que só exista uma licença ativa
    Optional<Licenca> findTopByOrderByIdDesc();
}
