package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="itemPedido")
public class ItemPedido implements Serializable {

	private Long idItem;
	private int produto;
	private Pedido pedido;
	private int quantidade;
	private double valor;

	public ItemPedido(int produto, Pedido pedido, int quantidade, double valor) {
		this.produto = produto;
		this.pedido = pedido;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "idItem", unique = true, nullable = false)
	public Long getIdItem() {
		return this.idItem;
	}

	public void setIdItem(Long idItem) {
		this.idItem = idItem;
	}

	@Column(name = "produto", nullable = false)
	public Integer getProduto() {
		return this.produto;
	}

	public void setProduto(int produto) {
		this.produto = produto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPedido", nullable = false)
	public Pedido getPedido() {
		return this.pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	@Column(name = "quantidade", nullable = false)
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "valor", nullable = false, precision = 10)
	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
