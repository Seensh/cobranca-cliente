package com.br.cobrancaCliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.cobrancaCliente.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
