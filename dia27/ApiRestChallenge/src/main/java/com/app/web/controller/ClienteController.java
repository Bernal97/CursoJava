package com.app.web.controller;


import java.util.ArrayList;
import java.util.List;
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

import com.app.web.entity.Cliente;

import com.app.web.service.IClienteService;

@RestController
@RequestMapping("/api")
public class ClienteController {

	@Autowired
	IClienteService dbUtility;
	
	
	//Para Crear
	
	@PostMapping("/clientes")
	public ResponseEntity<Cliente> createUser(@RequestBody Cliente user){
		try {
			Cliente usuario = dbUtility.save(new Cliente(user.getDni(), user.getNombre(), user.getApellido()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> getAllUsers(){
		try {
			List<Cliente> usuarios = new ArrayList<Cliente>();
				dbUtility.listAll().forEach(usuarios::add);
				if(usuarios.isEmpty()) {
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);	
				}					
				return new ResponseEntity<>(usuarios, HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}	
		}
	
	//Para traer

	
	@GetMapping("/clientes/{id}")
	public ResponseEntity<Cliente> getUserById(@PathVariable("id") Long id){
		Optional<Cliente> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	
	//Para Actualizar
	
	@PutMapping("/clientes/{id}")
	public ResponseEntity<Cliente> updateUser(@PathVariable("id") Long id, @RequestBody Cliente user){
		Optional<Cliente> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			Cliente usuario = usuarioData.get();
			usuario.setDni(user.getDni());
			usuario.setNombre(user.getNombre());
			usuario.setApellido(user.getApellido());
			return new ResponseEntity<>(dbUtility.save(usuario), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	//Para Nismear digo Deletear
	
	@DeleteMapping("/clientes/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") Long id){
		try {
			dbUtility.delete(id);
			return new ResponseEntity<> (HttpStatus.NO_CONTENT);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	

	
}
