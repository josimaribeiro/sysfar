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

	public Double getCdCliente() {
		return cdCliente;
	}

	public void setCdCliente(Double cdCliente) {
		this.cdCliente = cdCliente;
	}

	public Double getCdVendedor() {
		return cdVendedor;
	}

	public void setCdVendedor(Double cdVendedor) {
		this.cdVendedor = cdVendedor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataFicha() {
		return dataFicha;
	}

	public void setDataFicha(Date dataFicha) {
		this.dataFicha = dataFicha;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Double getLimiteCredito() {
		return limiteCredito;
	}

	public void setLimiteCredito(Double limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

    
    
    

    
    
    
}
