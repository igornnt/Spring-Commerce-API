package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import com.springcommerceapi.SpringCommerceAPI.repository.IPedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

	public Pedido buscarPedidoId(Long id){
		Pedido pedido = iPedidoRepository.findById(id).orElse(new Pedido());
		if(pedido.getIdPedido() == null){
			return pedido;
		}else {
			return pedido;
		}
	}

    public String alterarStatusPedido(Long id, String status) {
		Pedido pedido = iPedidoRepository.findById(id).orElse(new Pedido());
		if(iPedidoRepository.existsById(pedido.getIdPedido())) {
			pedido.setStatus(status);
			iPedidoRepository.save(pedido);
			return "Atualizado com sucesso";
		}
		return "Usuário não existe";
    }

	public List<Pedido> buscarPedidos() {
		return (List<Pedido>) iPedidoRepository.findAll();
	}
}
