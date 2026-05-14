package br.com.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sistema.model.LogExecucao;

import java.util.Optional;

public interface LogExecucaoRepository extends JpaRepository<LogExecucao, Long> {
    Optional<LogExecucao> findFirstByOrderByIdAsc();
}
