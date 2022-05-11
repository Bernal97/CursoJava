package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.Ventas;

public interface IVentasService {
public List<Ventas> listAll();
	
	public Ventas save(Ventas user);
	
	public Optional<Ventas> findById(Long id);
	
	public void delete(Long id);
}
