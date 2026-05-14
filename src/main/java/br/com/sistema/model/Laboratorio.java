
package br.com.sistema.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name = "laboratorios")
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_laboratorio")
	private Long cdLaboratorio;

	@Column(name = "id_area")
	private Double idArea;

	@NotBlank(message = "Nome é obrigatório")
	@Column(name = "nome", nullable = false, length = 40)
	private String nome;

	@Column(name = "razao")
	private String razao;

	@Column(name = "cnpj")
	private String cnpj;

	@Column(name = "endereco")
	private String endereco;

	@Column(name = "cidade")
	private String cidade;

	@Column(name = "fone")
	private String fone;

	@Column(name = "contato")
	private String contato;

	@Column(name = "tx_desconto")
	private Double txDesconto;

	@Column(name = "controle")
	private String controle;

	@Column(name = "dt_alteracao")
	private LocalDate dtAlteracao;

	@Column(name = "nprodutos")
	private Double nProdutos;

	@Column(name = "nitens")
	private Double nItens;

	@Column(name = "vprodutos")
	private Double vProdutos;

	@Column(name = "cprodutos")
	private Double cProdutos;

	@Column(name = "enviado")
	private String enviado;

	
	@CreationTimestamp
	@Column(name = "created_at", updatable = false)
	private LocalDateTime createdAt;

	@UpdateTimestamp
	@Column(name = "updated_at")
	private LocalDateTime updatedAt;

	
	public Long getCdLaboratorio() {
		return cdLaboratorio;
	}

	public void setCdLaboratorio(Long cdLaboratorio) {
		this.cdLaboratorio = cdLaboratorio;
	}

	public Double getIdArea() {
		return idArea;
	}

	public void setIdArea(Double idArea) {
		this.idArea = idArea;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = (nome != null) ? nome.toUpperCase() : null;
	}

	public String getRazao() {
		return razao;
	}

	public void setRazao(String razao) {
		this.razao = (razao != null) ? razao.toUpperCase() : null;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = (endereco != null) ? endereco.toUpperCase() : null;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = (cidade != null) ? cidade.toUpperCase() : null;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public Double getTxDesconto() {
		return txDesconto;
	}

	public void setTxDesconto(Double txDesconto) {
		this.txDesconto = txDesconto;
	}

	public String getControle() {
		return controle;
	}

	public void setControle(String controle) {
		this.controle = controle;
	}

	public LocalDate getDtAlteracao() {
		return dtAlteracao;
	}

	public void setDtAlteracao(LocalDate dtAlteracao) {
		this.dtAlteracao = dtAlteracao;
	}

	public Double getnProdutos() {
		return nProdutos;
	}

	public void setnProdutos(Double nProdutos) {
		this.nProdutos = nProdutos;
	}

	public Double getnItens() {
		return nItens;
	}

	public void setnItens(Double nItens) {
		this.nItens = nItens;
	}

	public Double getvProdutos() {
		return vProdutos;
	}

	public void setvProdutos(Double vProdutos) {
		this.vProdutos = vProdutos;
	}

	public Double getcProdutos() {
		return cProdutos;
	}

	public void setcProdutos(Double cProdutos) {
		this.cProdutos = cProdutos;
	}

	public String getEnviado() {
		return enviado;
	}

	public void setEnviado(String enviado) {
		this.enviado = enviado;
	}

}
