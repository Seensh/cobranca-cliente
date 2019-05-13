package com.br.cobrancaCliente.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idConta;
    private String tipo;
    private int banco;
    private int agencia;
    private int nConta;

    public Conta(){

    }

	public Conta(long id, String tipo, int banco, int agencia, int nConta) {
		super();
		this.idConta = id;
		this.tipo = tipo;
		this.banco = banco;
		this.agencia = agencia;
		this.nConta = nConta;
	}



	public long getId() {
		return idConta;
	}


	public void setId(long id) {
		this.idConta = id;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public int getBanco() {
		return banco;
	}


	public void setBanco(int banco) {
		this.banco = banco;
	}


	public int getAgencia() {
		return agencia;
	}


	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}


	public int getnConta() {
		return nConta;
	}


	public void setnConta(int nConta) {
		this.nConta = nConta;
	}

}
