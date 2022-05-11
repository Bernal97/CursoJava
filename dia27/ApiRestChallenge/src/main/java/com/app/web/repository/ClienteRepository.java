package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.web.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
