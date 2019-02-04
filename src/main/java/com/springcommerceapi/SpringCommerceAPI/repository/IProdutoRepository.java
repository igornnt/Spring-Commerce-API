package com.springcommerceapi.SpringCommerceAPI.repository;

import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IProdutoRepository extends CrudRepository<Produto,Long> {


}
