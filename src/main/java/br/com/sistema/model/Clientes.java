package br.com.sistema.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CLIENTES")

public class Clientes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CD_CLIENTE", nullable = false)
    private Double cdCliente;

    @Column(name = "CD_VENDEDOR")
    private Double cdVendedor;

    @Column(name = "NOME",nullable = false, length = 50)
    private String nome;

    @Column(name = "ENDERECO", length = 40)
    private String endereco;

    @Column(name = "CIDADE", length = 35)
    private String cidade;

    @Column(name = "UF", length = 2)
    private String uf;

    @Column(name = "CEP", length = 9)
    private String cep;

    @Column(name = "DATA_FICHA")
    @Temporal(TemporalType.DATE)
    private Date dataFicha;

    @Column(name = "CPF", length = 14)
    private String cpf;

    @Column(name = "CNPJ", length = 18)
    private String cnpj;

    @Column(name = "EMAIL", length = 45)
    private String email;

    @Column(name = "RENDA")
    private Double renda;

    @Column(name = "LIMITE_CREDITO")
    private Double limiteCredito;

    @Column(name = "STATUS", length = 1)
    private String status;

    
    
    
    
    
}
