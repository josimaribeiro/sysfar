
package br.com.sistema.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class LogExecucao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataHora;

    // Getter
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    // Setter
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    // Getter e Setter para id (opcional, mas recomendado)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
