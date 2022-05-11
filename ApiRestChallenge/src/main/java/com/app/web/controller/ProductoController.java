package com.app.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.app.web.entity.Producto;

import com.app.web.service.IProductoService;

@Controller
public class ProductoController {


	@Autowired
	IProductoService dbUtility;
	
	
	//Para Crear
	
	@PostMapping("/detventas")
	public ResponseEntity<Producto> createUser(@RequestBody Producto user){
		try {
			Producto usuario = dbUtility.save(new Producto(user.getCodigo_prod(), user.getNombre_prod(), user.getStock_prod()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//Para traer

	
	@GetMapping("/detventas/{id}")
	public ResponseEntity<Producto> getUserById(@PathVariable("id") Long id){
		Optional<Producto> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	
	//Para Actualizar
	
	@PutMapping("/detventas/{id}")
	public ResponseEntity<Producto> updateUser(@PathVariable("id") Long id, @RequestBody Producto user){
		Optional<Producto> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			Producto usuario = usuarioData.get();
			usuario.setCodigo_prod(user.getCodigo_prod());
			usuario.setNombre_prod(user.getNombre_prod());
			usuario.setStock_prod(user.getStock_prod());
			return new ResponseEntity<>(dbUtility.save(usuario), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//Para Nismear digo Deletear
	
	@DeleteMapping("/detventas/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id){
		try {
			dbUtility.delete(id);
			return new ResponseEntity<> (HttpStatus.NO_CONTENT);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
