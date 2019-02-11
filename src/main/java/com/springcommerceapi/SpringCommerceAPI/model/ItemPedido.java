package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.*;

@Entity
@Table(name="itemPedido")
public class ItemPedido{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idItem;

	private Long produto;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="pedido_id", nullable=false)
	private Pedido pedido;

	private int quantidade;
	private double valor;

	public ItemPedido(){

    }

	public ItemPedido(Long produto, Pedido pedido, int quantidade, double valor) {
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

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
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
