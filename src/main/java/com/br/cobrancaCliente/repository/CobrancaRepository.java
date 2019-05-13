package com.br.cobrancaCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cobrancaCliente.model.Cobranca;

public interface CobrancaRepository extends JpaRepository<Cobranca, Long> {

}
