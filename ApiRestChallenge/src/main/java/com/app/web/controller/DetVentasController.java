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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.app.web.entity.DetVentas;

import com.app.web.service.IDetVentasService;

@RestController
@RequestMapping("/api")
public class DetVentasController {


	@Autowired
	IDetVentasService dbUtility;
	
	
	//Para Crear
	
	@PostMapping("/detventas")
	public ResponseEntity<DetVentas> createUser(@RequestBody DetVentas user){
		try {
			DetVentas usuario = dbUtility.save(new DetVentas(user.getUna_venta(), user.getUn_prod(), user.getCantidadProd()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//Para traer

	
	@GetMapping("/detventas/{id}")
	public ResponseEntity<DetVentas> getUserById(@PathVariable("id") Long id){
		Optional<DetVentas> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	
	//Para Actualizar
	
	@PutMapping("/detventas/{id}")
	public ResponseEntity<DetVentas> updateUser(@PathVariable("id") Long id, @RequestBody DetVentas user){
		Optional<DetVentas> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			DetVentas usuario = usuarioData.get();
			usuario.setUna_venta(user.getUna_venta());
			usuario.setUn_prod(user.getUn_prod());
			usuario.setCantidadProd(user.getCantidadProd());
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
