package com.springcommerceapi.SpringCommerceAPI.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.springcommerceapi.SpringCommerceAPI.model.Cliente;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

        public Cliente findByNomeIgnoreCase(String nome);
}
