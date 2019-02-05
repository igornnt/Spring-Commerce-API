package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedido")
public class PedidoResource {

	@Autowired
	PedidoService pedidoService;

	public PedidoResource(PedidoService pedidoService) {
		this.pedidoService = pedidoService;
	}

	@PostMapping("/cadastrar")
	@ResponseBody
	public String cadastrarPedido(Pedido pedido) {
		pedidoService.salvarPedido(pedido);
		return ("pedido salvo");
	}

}
