package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.ItemPedido;
import com.springcommerceapi.SpringCommerceAPI.repository.IItemPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidoService {

	@Autowired
	IItemPedidoRepository iItemPedidoRepository;

	public ItemPedidoService(IItemPedidoRepository iItemPedidoRepository) {
		this.iItemPedidoRepository = iItemPedidoRepository;
	}

	public void salvarItemPedido(ItemPedido itemPedido){
		iItemPedidoRepository.save(itemPedido);
	}

	public boolean verificarDisponibilidade() {
		return false;
	}

	public void adicionarProduto() {

	}

	public void atualizarQuanidadeItem() {

	}

}
