package com.springcommerceapi.SpringCommerceAPI.service;

import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import com.springcommerceapi.SpringCommerceAPI.repository.IProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

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

	public String deletarProduto(Long id){
	     Produto produto = iProdutoRepository.findById(id).orElse(new Produto());
	     if(produto.getId() == null){
	         return "produto não encontrado!";
         }else {
             iProdutoRepository.delete(produto);
             return "produto deletado com sucesso!";
         }
	}




}
