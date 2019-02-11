package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.service.ItemPedidoService;
import com.springcommerceapi.SpringCommerceAPI.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/pedido")
public class PedidoResource {

	@Autowired
	PedidoService pedidoService;

	@Autowired
	ItemPedidoService itemPedidoService;

	@PostMapping(value = "/cadastrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public Pedido cadastrarPedido(@RequestBody Pedido pedido) {
		pedidoService.salvarPedido(pedido);
		return pedido;
	}

	@GetMapping("/buscarpedido/{id}")
	@ResponseBody
	public Pedido buscarPedidoId(@PathVariable Long id){
		return pedidoService.buscarPedidoId(id);
	}

	@GetMapping("/buscarpedidos")
	@ResponseBody
	public List<Pedido> buscarPedidos(){
		return pedidoService.buscarPedidos();
	}

	@PutMapping("/alterarstatus/{id}")
	@ResponseBody
	public String alterarStatusPedido(@PathVariable Long id, @RequestParam(value = "status") String status) {
		pedidoService.alterarStatusPedido(id, status);
		return ("status do pedido alterado");
	}

}
