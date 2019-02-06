package com.springcommerceapi.SpringCommerceAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcommerceapi.SpringCommerceAPI.model.Cliente;
import com.springcommerceapi.SpringCommerceAPI.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public void salvarCliente(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	public Cliente recuperarCliente(String nome) {
		return clienteRepository.findByNomeIgnoreCase(nome);
	}

    public String deletarCliente(Long id) {

	    Cliente cliente = clienteRepository.findById(id).orElse(new Cliente());

	    if(cliente.getId() == null){
            return "Não existe esse cliente!";
        }else{
            clienteRepository.deleteById(id);
            return "Cliente foi deletado com sucesso!";
        }
    }
}
