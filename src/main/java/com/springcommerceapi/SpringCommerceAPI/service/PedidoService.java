package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PedidoService {

	@Autowired
	IPedidoRepository iPedidoRepository;

	public PedidoService(IPedidoRepository iProdutoRepository) {
		this.iPedidoRepository = iProdutoRepository;
	}

	public Pedido salvarPedido(Pedido pedido){
		iPedidoRepository.save(pedido);
		return pedido;
	}

}
