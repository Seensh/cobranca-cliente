package com.br.cobrancaCliente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.cobrancaCliente.model.Cliente;
import com.br.cobrancaCliente.service.CobrancaClienteService;

@RestController
@RequestMapping("/api")
public class CobrancaClienteController {
	
	@Autowired
	private CobrancaClienteService cobrancaClienteService;
	
	
	@RequestMapping(value = "/listarclientes", method = RequestMethod.GET)
	public List<Cliente> listarClientes(){
		List<Cliente> clientes = cobrancaClienteService.listarClientes();

		return clientes;
	}
	
	@RequestMapping(value = "/cobrancaemail", method = RequestMethod.POST)
	public ResponseEntity<String> cobrancaEmail(Cliente cliente){
		 if (0==1) {
		        return ResponseEntity.badRequest()
		            .body("Algo deu errado!");
		    }
		
		 cobrancaClienteService.cobrarEmail(cliente);
		 
		return ResponseEntity.status(HttpStatus.OK)
		        .body("Cobranca enviada com sucesso.");
	}
}
