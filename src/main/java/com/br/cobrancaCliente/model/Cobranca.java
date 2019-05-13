package com.br.cobrancaCliente.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cobranca {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCobranca;
	private String tipo;
	
	public Cobranca() {
		
	}

	public Cobranca(Long id, String tipo) {
		super();
		this.idCobranca = id;
		this.tipo = tipo;
	}

	public Long getId() {
		return idCobranca;
	}

	public void setId(Long id) {
		this.idCobranca = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCobranca == null) ? 0 : idCobranca.hashCode());
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
		Cobranca other = (Cobranca) obj;
		if (idCobranca == null) {
			if (other.idCobranca != null)
				return false;
		} else if (!idCobranca.equals(other.idCobranca))
			return false;
		return true;
	}
}
