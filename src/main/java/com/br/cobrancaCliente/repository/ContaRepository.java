package com.br.cobrancaCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cobrancaCliente.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Long> {

}
