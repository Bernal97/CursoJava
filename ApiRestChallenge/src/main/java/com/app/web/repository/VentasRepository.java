package com.app.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.web.entity.Ventas;

public interface VentasRepository extends JpaRepository<Ventas, Long>{

	@Query("SELECT e FROM ventas e WHERE e.un_client = :cliente")
	public List<Ventas> ListAll(Long id);
	
}
