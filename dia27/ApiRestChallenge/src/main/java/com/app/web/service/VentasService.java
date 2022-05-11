package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Ventas;
import com.app.web.repository.VentasRepository;

@Service
public class VentasService implements IVentasService {

	@Autowired
	private VentasRepository dbUtility;
	
	@Override
	public List<Ventas> listAll() {
		// TODO Auto-generated method stub
		return dbUtility.findAll();
	}

	@Override
	public Ventas save(Ventas user) {
		return dbUtility.save(user);

	}

	@Override
	public Optional<Ventas> findById(Long id) {
		// TODO Auto-generated method stub
		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);

	}

}
