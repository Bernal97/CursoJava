package com.app.web.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.app.web.model.User;
import com.app.web.repository.UserRepository;

@Controller
@RequestMapping("users")
public class UserController {
	
	@Autowired
	UserRepository dbUtility;
	
	
	//Para Crear
	@PostMapping("/create")
	public String saveUser(User users /*, @RequestParam("file") MultipartFile archive */) {	
		if(users.getId() == null) {
			dbUtility.save(users);
			return "redirect:/users";
		}else {
			return "xd";
		}
	}
		/*if(!archive.isEmpty()) {
			Path folderImagenes = Paths.get("src//main//resources//static//images");
			String rutaAbs = folderImagenes.toFile().getAbsolutePath();
			
			try {
				byte[] bytesImg = archive.getBytes();
				Path rutaCompleta = Paths.get(rutaAbs + "//" + archive.getOriginalFilename());
				Files.write(rutaCompleta, bytesImg);
				users.setImage(archive.getOriginalFilename());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
	
	
	/*
	@PostMapping("/users")
	public ResponseEntity<User> createUser(@RequestBody User user){
		try {
			User usuario = dbUtility.save(new User(user.getFirstName(), user.getLastName(), user.getAge(), user.isWin()));
			return new ResponseEntity<>(usuario, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	*/
	//Para traer
	
	@GetMapping
	public String index(Model modelo) {
		modelo.addAttribute("User", dbUtility.findAll());
		return "index";
	}
	
	@GetMapping("/create")
	public String showFormUser(Model modelo) {
		User usuario = new User();
		modelo.addAttribute("User", usuario);
		return "formUser";
	}
	
	
	/*
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String firstName){
		try {
			List<User> usuarios = new ArrayList<User>();
			if(firstName == null) 
				dbUtility.findAll().forEach(usuarios::add);
			else 
				dbUtility.findByFirstName(firstName).forEach(usuarios::add);
				if(usuarios.isEmpty()) 
					return new ResponseEntity<>(HttpStatus.NO_CONTENT);				
				return new ResponseEntity<>(usuarios, HttpStatus.OK);
			
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}	
		}

	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable("id") String id){
		Optional<User> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			return new ResponseEntity<>(usuarioData.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}	
	}
	
	@GetMapping("/users/wins")
	public ResponseEntity<List<User>> findByWin(){
		try {
			List<User> usuarios = dbUtility.findByWin(true);
			if(usuarios.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(usuarios, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	*/
	//Para Actualizar
	@GetMapping("/edit/{id}")
	public String updateUser(@PathVariable("id") String id, Model modelo) {
		Optional<User> usuario = dbUtility.findById(id);
		modelo.addAttribute("User", usuario);
		return "formUserEdit";
	}
	
	@PutMapping("/edit/{id}")
	public String formUpdate(User users) {
		dbUtility.save(users);
		return "redirect:/users";
	}
	
	/*
	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable("id") String id, @RequestBody User user){
		Optional<User> usuarioData = dbUtility.findById(id);
		if(usuarioData.isPresent()) {
			User usuario = usuarioData.get();
			usuario.setFirstName(user.getFirstName());
			usuario.setLastName(user.getLastName());
			usuario.setAge(user.getAge());
			usuario.setWin(user.isWin());
			return new ResponseEntity<>(dbUtility.save(usuario), HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	*/
	
	//Para Nismear digo Deletear
	
	
	@GetMapping("/delete/{id}")
	public String deleteUser(@PathVariable(value = "id") String id){
		dbUtility.deleteById(id);
		return "redirect:/users";
		
	}
	
	/*
	@DeleteMapping("/users/{id}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") String id){
		try {
			dbUtility.deleteById(id);
			return new ResponseEntity<> (HttpStatus.NO_CONTENT);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	
	
	@DeleteMapping("/users")
	public ResponseEntity<HttpStatus> deleteAllUsers(){
		try {
			dbUtility.deleteAll();
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}
	*/
	
}
	


