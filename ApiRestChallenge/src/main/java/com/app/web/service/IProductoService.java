package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.Producto;

public interface IProductoService {

public List<Producto> listAll();
	
	public Producto save(Producto user);
	
	public Optional<Producto> findById(Long id);
	
	public void delete(Long id);
}
