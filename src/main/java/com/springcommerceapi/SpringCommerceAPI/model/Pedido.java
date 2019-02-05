package com.springcommerceapi.SpringCommerceAPI.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="pedido")
public class Pedido implements Serializable {

	private Long idPedido;
	private Date dataPedido;
	private String status;
	private double valorTotal;
	private long cliente;
	private List<ItemPedido> itens = new ArrayList<ItemPedido>();

	public Pedido(Long idPedido, Date dataPedido, String status, double valorTotal, long cliente, List<ItemPedido> itens) {
		this.idPedido = idPedido;
		this.dataPedido = dataPedido;
		this.valorTotal = valorTotal;
		this.status = status;
		this.cliente = cliente;
		this.itens = itens;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "idPedido", unique = true, nullable = false)
	public Long getIdPedido() {
		return this.idPedido;
	}

	public void setIdPedido(Long idPedido) {
		this.idPedido = idPedido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dataPedido", nullable = false, length = 19)
	public Date getDataPedido() {
		return this.dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	@Column(name = "status", nullable = false, length = 20)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "valorTotal", nullable = false, precision = 10)
	public double getValorTotal() {
		return this.valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}

	@Column(name = "cliente", nullable = false, precision = 10)

	public double getCliente() {
		return this.cliente;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pedido")
	@Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
	public List<ItemPedido> getItens() {
		return this.itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

}