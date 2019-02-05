package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.Cliente;
import com.springcommerceapi.SpringCommerceAPI.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	ClienteService clienteService;
	public ClienteResource(ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping("/cadastrar")
	@ResponseBody
	public String cadastrarCliente(Cliente cliente) {
		clienteService.salvarCliente(cliente);
		return "Cliente Cadastrado";
	}

	public Cliente recuperarCliente() {
		return null;
	}

	public List<Cliente> recuperarTodosClientes() {
		return null;
	}

	public Cliente atualizarCliente() {
		return null;
	}

	public Cliente deletarCliente() {
		return null;
	}

}
