package br.com.sistema.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Licenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Data da última execução do sistema
    @Column(name = "data_ultima_execucao")
    private LocalDate dataUltimaExecucao;

    // Data da última autenticação válida
    @Column(name = "data_autenticacao", nullable = false)
    private LocalDate dataAutenticacao;

    // Criado automaticamente na primeira vez
    @Column(name = "created_at", nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public Licenca() {}

    // Getters e Setters
    public Long getId() { return id; }

    public LocalDate getDataUltimaExecucao() { return dataUltimaExecucao; }
    public void setDataUltimaExecucao(LocalDate dataUltimaExecucao) { this.dataUltimaExecucao = dataUltimaExecucao; }

    public LocalDate getDataAutenticacao() { return dataAutenticacao; }
    public void setDataAutenticacao(LocalDate dataAutenticacao) { this.dataAutenticacao = dataAutenticacao; }

    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
}
