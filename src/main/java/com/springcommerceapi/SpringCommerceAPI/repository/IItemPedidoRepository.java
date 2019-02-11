package com.springcommerceapi.SpringCommerceAPI.repository;

import com.springcommerceapi.SpringCommerceAPI.model.ItemPedido;
import com.springcommerceapi.SpringCommerceAPI.model.Pedido;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IItemPedidoRepository extends CrudRepository<ItemPedido,Long> {

    List<ItemPedido> findByPedido(Pedido pedido);

}
