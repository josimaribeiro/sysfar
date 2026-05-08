package br.com.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.sistema.model.Laboratorio;

public interface LaboratorioRepository extends JpaRepository<Laboratorio, Long> {
}
