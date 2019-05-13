package com.br.cobrancaCliente.service;

import java.util.List;

import com.br.cobrancaCliente.model.Cliente;

public interface CobrancaClienteService {

    List<Cliente> listarClientes();
    
    Cliente cobrarEmail(Cliente cliente);
}
