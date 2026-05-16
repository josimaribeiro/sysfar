package br.com.sistema.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.sistema.model.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Double> {
	
}
