package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Producto;
import com.example.demo.service.ProductoService;

import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;

@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/v1")

@RequiredArgsConstructor

public class ProductoController {

	
	
	@Autowired
	private  ProductoService productoService;
	
	@PostMapping("/productos")
	public void save(@RequestBody Producto producto) {
		productoService.save(new Producto (producto.getCodigo(), producto.getNombreProducto(), producto.getCantidad(), producto.getPrecio()));
	}
	
	
	@GetMapping("/productos")
	public List<Producto> findAll(){
		return productoService.findAll();
	}
	
	@GetMapping("/productos/{id}")
	public Producto findByCode(@PathVariable String codigo) {
		return productoService.findByCode(codigo).get();
	}
	
	
	@DeleteMapping("/productos/{id}")
	public void deleteById(@PathVariable String codigo) {
		productoService.deleteByCode(codigo);
	}
	
	@PutMapping("/productos")
	public void update(@RequestBody Producto persona) {
		productoService.save(persona);
	}
}
