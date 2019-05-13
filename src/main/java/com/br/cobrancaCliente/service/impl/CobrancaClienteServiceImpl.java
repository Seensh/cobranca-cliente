package com.br.cobrancaCliente.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.br.cobrancaCliente.model.Cliente;
import com.br.cobrancaCliente.repository.ClienteRepository;
import com.br.cobrancaCliente.service.CobrancaClienteService;

@Service
public class CobrancaClienteServiceImpl implements CobrancaClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    
	@Autowired private JavaMailSender mailSender;

    @Override
    public List<Cliente> listarClientes(){
        return this.clienteRepository.findAll();
    }
    
    @Override
    public String cobrarEmail(Cliente cliente) {
    	SimpleMailMessage message = new SimpleMailMessage();
        message.setText("Mensagem de teste do servico de cobranca por email");
        message.setTo(cliente.getEmail());
        message.setFrom("bancoitau@gmail.com");
        message.setSubject("Cobranca Online");

        try {
            mailSender.send(message);
            return "Email enviado com sucesso!";
        } catch (Exception e) {
            e.printStackTrace();
            return "Erro ao enviar email.";
        }
    	
    }

}
