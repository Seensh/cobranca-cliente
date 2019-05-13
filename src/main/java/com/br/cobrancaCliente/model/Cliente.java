package com.br.cobrancaCliente.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCliente;
	private String nome;
	private int telefone;
	private String email;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idConta")
	private Conta conta;
	
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCobranca")
	private Cobranca cobranca;
		

	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, int telefone, String email, Conta conta, Cobranca cobranca) {
		super();
		this.idCliente = id;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.conta = conta;
		this.cobranca = cobranca;
	}

	public Long getId() {
		return idCliente;
	}

	public void setId(Long id) {
		this.idCliente = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public Cobranca getCobranca() {
		return cobranca;
	}

	public void setCobranca(Cobranca cobranca) {
		this.cobranca = cobranca;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCliente == null) ? 0 : idCliente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		if (idCliente == null) {
			if (other.idCliente != null)
				return false;
		} else if (!idCliente.equals(other.idCliente))
			return false;
		return true;
	}
}
