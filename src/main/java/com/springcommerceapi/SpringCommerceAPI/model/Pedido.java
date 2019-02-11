package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedido;

	//@OneToOne(cascade = CascadeType.ALL)
	private Long cliente;

	private Date dataPedido;
	private String status;
	private double valorTotal;

	@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL,
			fetch = FetchType.LAZY)
	private Set<ItemPedido> itemPedido;

	public Pedido(Long cliente, String status, double valorTotal, Set<ItemPedido> itemPedido) {
		this.setValorTotal(valorTotal);
		this.setStatus(status);
		this.setCliente(cliente);
		this.setItemPedido(itemPedido);
	}

	public Pedido(){

	}

	public Long getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Long getCliente() {
		return cliente;
	}

	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}

	public Set<ItemPedido> getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(Set<ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
}