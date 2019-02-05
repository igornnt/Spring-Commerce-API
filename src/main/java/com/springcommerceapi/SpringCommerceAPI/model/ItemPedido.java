package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.*;

@Entity
@Table(name="itemPedido")
public class ItemPedido{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long idItem;
	private Long produto;
	private Long pedido;
	private int quantidade;
	private double valor;

	public ItemPedido(){

    }

	public ItemPedido(Long produto, Long pedido, int quantidade, double valor) {
		this.setProduto(produto);
		this.setPedido(pedido);
		this.setQuantidade(quantidade);
		this.setValor(valor);
	}

    public Long getIdItem() {
        return idItem;
    }

    public void setIdItem(Long idItem) {
        this.idItem = idItem;
    }

    public Long getProduto() {
        return produto;
    }

    public void setProduto(Long produto) {
        this.produto = produto;
    }

    public Long getPedido() {
        return pedido;
    }

    public void setPedido(Long pedido) {
        this.pedido = pedido;
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
