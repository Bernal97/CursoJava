package com.app.web.service;

import java.util.List;
import java.util.Optional;

import com.app.web.entity.DetVentas;

public interface IDetVentasService {
	public List<DetVentas> listAll();
	
	public DetVentas save(DetVentas user);
	
	public Optional<DetVentas> findById(Long id);
	
	public void delete(Long id);
}
