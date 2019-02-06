package com.springcommerceapi.SpringCommerceAPI.resource;
import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import com.springcommerceapi.SpringCommerceAPI.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


	@PostMapping("/cadastrar")
	@ResponseBody
	public String cadastraProduto(Produto produto){
		produtoService.salvarProduto(produto);
		return "produto salvo";
	}

	@DeleteMapping("/deletar/{id}")
	@ResponseBody
	public String deletarProduto(@PathVariable Long id){
		return produtoService.deletarProduto(id);
	}


	@GetMapping("/buscarproduto/{id}")
	@ResponseBody
	public Produto buscarProdutoId(@PathVariable Long id){
	    return produtoService.buscarProdutoId(id);
	            
	}

	@GetMapping("/buscarproduto/")
	@ResponseBody
	public Produto buscarProdutoNome(@RequestParam(value="nome") String nome){
		return produtoService.buscarProdutoNome(nome);
	}

	@PostMapping("/alterarproduto/{id}/")
    @ResponseBody
    public Produto atualizarProduto (@PathVariable Long id, Produto produto){
        produtoService.alterarProduto(id, produto);
	    return null;
    }

}
