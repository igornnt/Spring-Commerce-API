package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.model.Status;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedido", produces = MediaType.APPLICATION_JSON_VALUE)
public class PedidoResource {

	public void adicionarItem() { }

	@RequestMapping(value = "/criar", method = RequestMethod.POST)
	public Pedido criarPedido() {
		return null;
	}

	public Pedido buscarPedido() {
		return null;
	}

	public Status alterarStatusPedido() {
		return null;
	}

}
