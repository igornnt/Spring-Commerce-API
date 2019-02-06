package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.Cliente;
import com.springcommerceapi.SpringCommerceAPI.service.ClienteService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/buscar/")
	@ResponseBody
	public Cliente recuperarClienteNome(@RequestParam(value="nome")String nome) {
		return clienteService.recuperarClienteNome(nome);

	}

	@GetMapping("/buscar/{id}")
	@ResponseBody
	public Cliente recuperarClienteId(@PathVariable Long id) {
		return clienteService.recuperarClienteId(id);

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
