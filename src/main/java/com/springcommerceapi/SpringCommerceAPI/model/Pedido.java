package com.springcommerceapi.SpringCommerceAPI.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idPedido;
	private Long cliente;
	private Date dataPedido;
	private String status;
	private double valorTotal;

	public Pedido(){

	}

	public Pedido(Long idPedido, Long cliente, Date dataPedido, String status, double valorTotal) {
		this.setIdPedido(idPedido);
		this.setDataPedido(dataPedido);
		this.setValorTotal(valorTotal);
		this.setStatus(status);
		this.setCliente(cliente);
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
}