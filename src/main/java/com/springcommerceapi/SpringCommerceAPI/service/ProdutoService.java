package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import com.springcommerceapi.SpringCommerceAPI.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

	@Autowired
	IProdutoRepository iProdutoRepository;

	public ProdutoService(IProdutoRepository iProdutoRepository) {
		this.iProdutoRepository = iProdutoRepository;
	}

	public void salvarProduto(Produto produto){
		iProdutoRepository.save(produto);
	}


}
