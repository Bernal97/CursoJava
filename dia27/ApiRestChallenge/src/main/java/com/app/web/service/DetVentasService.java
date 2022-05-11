package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.DetVentas;
import com.app.web.repository.DetVentasRepository;

@Service
public class DetVentasService implements IDetVentasService {

	@Autowired
	private DetVentasRepository dbUtility;
	
	
	@Override
	public List<DetVentas> listAll() {

		return dbUtility.findAll();
	}

	@Override
	public DetVentas save(DetVentas user) {
		return dbUtility.save(user);

	}

	@Override
	public Optional<DetVentas> findById(Long id) {

		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

}
