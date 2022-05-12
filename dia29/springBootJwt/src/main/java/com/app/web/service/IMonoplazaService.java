package com.app.web.service;

import java.util.List;

import com.app.web.entity.Monoplaza;

public interface IMonoplazaService {

	public List<Monoplaza> listAll(String equipoClave);
	
	public void save(Monoplaza vehiculo);
	
	public Monoplaza findById(Long id);
	
	public void delete(Long id);
}
