package com.br.cobrancaCliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cobrancaCliente.model.Cliente;
import com.br.cobrancaCliente.repository.ClienteRepository;
import com.br.cobrancaCliente.service.CobrancaClienteService;

@Service
public class CobrancaClienteServiceImpl implements CobrancaClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> listarClientes(){
        return this.clienteRepository.findAll();
    }
    
    @Override
    public Cliente cobrarEmail(Cliente cliente) {
    	
			return this.clienteRepository.save(cliente);
    	
    }

}
