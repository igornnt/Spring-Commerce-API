package com.springcommerceapi.SpringCommerceAPI.resource;
import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import com.springcommerceapi.SpringCommerceAPI.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produtos")
public class ProdutoResource {

	@Autowired
	ProdutoService produtoService;

	public ProdutoResource(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}


	@RequestMapping("/teste")
	@ResponseBody
	public String ola(){
		return "Hello world";
	}


	@PostMapping("cadastrar")
	@ResponseBody
	public String cadastraProduto(Produto produto){
		produtoService.salvarProduto(produto);
		return "produto salvo";
	}

}
