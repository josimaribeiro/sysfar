package br.com.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import java.time.LocalDateTime;

@Entity
public class Licenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dataAutenticacaoCriptografada;

    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    // Construtor vazio exigido pelo JPA
    public Licenca() {}
    
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    // Getter e Setter para dataAutenticacaoCriptografada
    public String getDataAutenticacaoCriptografada() {
        return dataAutenticacaoCriptografada;
    }

    public void setDataAutenticacaoCriptografada(String dataAutenticacaoCriptografada) {
        this.dataAutenticacaoCriptografada = dataAutenticacaoCriptografada;
    }

    // Getter e Setter para createdAt
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
