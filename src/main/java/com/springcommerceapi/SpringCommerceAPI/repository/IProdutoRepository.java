package com.springcommerceapi.SpringCommerceAPI.repository;

import com.springcommerceapi.SpringCommerceAPI.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface IProdutoRepository extends JpaRepository<Produto,Long> {

    Produto findByNome(String nome);


}
