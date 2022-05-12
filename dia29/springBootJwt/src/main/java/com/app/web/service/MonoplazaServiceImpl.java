package com.app.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Monoplaza;
import com.app.web.repository.MonoplazaRepository;


@Service
public class MonoplazaServiceImpl implements IMonoplazaService{

	
	@Autowired
	private MonoplazaRepository dbUtility;
	
	public List<Monoplaza> listAll(String equipoClave) {
		if(equipoClave != null) {
			return (List<Monoplaza>) dbUtility.findAll(equipoClave);
		}else {
			return (List<Monoplaza>) dbUtility.findAll();
		}
		
	}

	@Override
	public void save(Monoplaza vehiculo) {
		dbUtility.save(vehiculo);
		
	}

	@Override
	public Monoplaza findById(Long id) {
		return dbUtility.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);
		
	}


}
