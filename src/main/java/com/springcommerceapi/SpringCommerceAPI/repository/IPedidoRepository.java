package com.springcommerceapi.SpringCommerceAPI.repository;

import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import org.springframework.data.repository.CrudRepository;

public interface IPedidoRepository extends CrudRepository<Pedido, Long> {
}
