package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", unique = true, nullable = false, columnDefinition = "serial")
	private Long id;

	@Temporal(TemporalType.DATE)
	@Column(name="dataPedido")
	private Date dataPedido;

	@NotBlank
	@Column(name="valorTotal")
	@Size(max = 25)
	private double valorTotal;

	@NotBlank
	@Column(name="status")
	@Size(max = 9)
	private String status;

	@NotBlank
	@Column(name="cliente")
	@Size(max = 10)
	private long cliente;

	@ManyToOne
	private List<ItemPedido> ItemPedido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getCliente() {
		return cliente;
	}

	public void setCliente(long cliente) {
		this.cliente = cliente;
	}
}
