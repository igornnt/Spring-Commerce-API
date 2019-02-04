package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "itemPedido")
public class ItemPedido {

	@NotBlank
	@Column(name="pedido")
	@Size(max = 10)
	private long pedido;

	@NotBlank
	@Column(name="produto")
	@Size(max = 10)
	private long produto;

	@NotBlank
	@Column(name="quantidade")
	@Size(max = 5)
	private int quantidade;

	@NotBlank
	@Column(name="valor")
	@Size(max = 10)
	private double valor;

	public long getPedido() {
		return pedido;
	}

	public void setPedido(long pedido) {
		this.pedido = pedido;
	}

	public long getProduto() {
		return produto;
	}

	public void setProduto(long produto) {
		this.produto = produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
