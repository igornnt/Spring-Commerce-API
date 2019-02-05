package com.springcommerceapi.SpringCommerceAPI.resource;

import com.springcommerceapi.SpringCommerceAPI.model.ItemPedido;
import com.springcommerceapi.SpringCommerceAPI.service.ItemPedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/itempedido")
public class ItemPedidoResource {

    @Autowired
    ItemPedidoService itemPedidoService;

    public ItemPedidoResource(ItemPedidoService itemPedidoService) {
        this.itemPedidoService = itemPedidoService;
    }

    @PostMapping("/cadastrar")
    @ResponseBody
    public String cadastrarPedido(ItemPedido itemPedido) {
        itemPedidoService.salvarItemPedido(itemPedido);
        return ("item pedido salvo");
    }

}
