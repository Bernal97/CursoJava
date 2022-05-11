package com.app.web.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.app.web.entity.Ventas;
import com.app.web.service.IVentasService;

public class VentasController {


	@Autowired
	IVentasService dbUtility;
	
	
	//Para Crear
	
	@PostMapping("/detventas")
	public ResponseEntity<Ventas> createUser(@RequestBody Ventas user){
		try {
			Ventas usuario = dbUtility.save(new Ventas(user.getUn_client()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//Para traer

	
	@GetMapping("/detventas/{id}")
	public ResponseEntity<Ventas> getUserById(@PathVariable("id") Long id){
		Optional<Ventas> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	
	//Para Actualizar
	
	@PutMapping("/detventas/{id}")
	public ResponseEntity<Ventas> updateUser(@PathVariable("id") Long id, @RequestBody Ventas user){
		Optional<Ventas> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			Ventas usuario = usuarioData.get();
			usuario.setUn_client(user.getUn_client());
			
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
