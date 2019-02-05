package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.ItemPedido;
import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.repository.IItemPedidoRepository;
import com.springcommerceapi.SpringCommerceAPI.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

	@Autowired
	IPedidoRepository iPedidoRepository;

	public PedidoService(IPedidoRepository iPedidoRepository) {
		this.iPedidoRepository = iPedidoRepository;
	}

	public void salvarPedido(Pedido pedido){
		iPedidoRepository.save(pedido);
	}

}
