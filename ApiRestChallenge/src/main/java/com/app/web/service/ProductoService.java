package com.app.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.entity.Producto;
import com.app.web.repository.ProductoRepository;

@Service
public class ProductoService implements IProductoService {

	@Autowired
	private ProductoRepository dbUtility;
	
	@Override
	public List<Producto> listAll() {
		// TODO Auto-generated method stub
		return dbUtility.findAll();
	}

	@Override
	public Producto save(Producto user) {
		return dbUtility.save(user);

	}

	@Override
	public Optional<Producto> findById(Long id) {

		return dbUtility.findById(id);
	}

	@Override
	public void delete(Long id) {
		dbUtility.deleteById(id);

	}

}
