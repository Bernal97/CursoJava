package com.app.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.web.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}
