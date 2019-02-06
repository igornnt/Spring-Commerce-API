package com.springcommerceapi.SpringCommerceAPI.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;

import com.springcommerceapi.SpringCommerceAPI.model.Cliente;

import java.util.Optional;

@Transactional
public interface ClienteRepository extends CrudRepository<Cliente, Long>{

         Cliente findByNomeIgnoreCase(String nome);
}
