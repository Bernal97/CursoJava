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


import com.app.web.entity.Usuario;

import com.app.web.service.IUsuarioService;

public class UsuarioController {

	


	@Autowired
	IUsuarioService dbUtility;
	
	
	//Para Crear
	
	@PostMapping("/detventas")
	public ResponseEntity<Usuario> createUser(@RequestBody Usuario user){
		try {
			Usuario usuario = dbUtility.save(new Usuario(user.getNombre(), user.getApellido(), user.getEmail(), user.getPassword()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	
	//Para traer

	
	@GetMapping("/detventas/{id}")
	public ResponseEntity<Usuario> getUserById(@PathVariable("id") Long id){
		Optional<Usuario> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	
	//Para Actualizar
	
	@PutMapping("/detventas/{id}")
	public ResponseEntity<Usuario> updateUser(@PathVariable("id") Long id, @RequestBody Usuario user){
		Optional<Usuario> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			Usuario usuario = usuarioData.get();
			usuario.setNombre(usuario.getNombre());
			usuario.setApellido(user.getApellido());
			usuario.setEmail(user.getEmail());
			usuario.setPassword(user.getPassword());
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
