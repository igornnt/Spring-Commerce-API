package com.springcommerceapi.SpringCommerceAPI.resource;
import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import com.springcommerceapi.SpringCommerceAPI.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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


	@PostMapping(value = "/cadastrar", produces = MediaType.APPLICATION_JSON_VALUE)
	public String cadastraProduto(@RequestBody Produto produto){
		produtoService.salvarProduto(produto);
		return "produto salvo";
	}

	@DeleteMapping(value = "/deletar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	
	public String deletarProduto(@PathVariable Long id){
		return produtoService.deletarProduto(id);
	}


	@GetMapping(value = "/buscarproduto/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Produto buscarProdutoId(@PathVariable Long id){
	    return produtoService.buscarProdutoId(id);
	            
	}

	@GetMapping(value = "/buscarproduto/", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public Produto buscarProdutoNome(@RequestParam(value="nome") String nome){
		return produtoService.buscarProdutoNome(nome);
	}

	@PostMapping(value = "/alterarproduto/{id}/", consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Produto atualizarProduto (@PathVariable Long id, Produto produto){
        produtoService.alterarProduto(id, produto);
	    return null;
    }

}
