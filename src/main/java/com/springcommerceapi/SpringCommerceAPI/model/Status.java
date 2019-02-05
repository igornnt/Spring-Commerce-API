package com.springcommerceapi.SpringCommerceAPI.model;

import javax.persistence.Entity;
import javax.persistence.Table;

public enum Status {

    APROVADO("aprovado"), CANCELADO("cancelado");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
