package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;



@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public void save (Producto producto) {
		productoRepository.save(producto);
	}
	
	public List<Producto> findAll(){
		return productoRepository.findAll();
	}
	
	
	//El optional es por si existe
	public Optional<Producto> findByCode(String codigo) {
		return productoRepository.findById(codigo);
	}
	
	public void deleteByCode(String codigo) {
		productoRepository.deleteById(codigo);
	}
}
	

