package com.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mvc.model.Coleccion;
import com.mvc.model.User;
import com.mvc.service.UserService;

@Controller
@RequestMapping("/mvc")
public class UserController {

	
	@Autowired
	private  UserService userService;
	
	
	@GetMapping("/usuarios")
	public String index(Model usuario) {
		Coleccion corredores = new Coleccion();
		corredores.addPerson(new User(1, "Kimi", "Raikonnen", 2, "2018"));
		corredores.addPerson(new User(2, "Lewis", "Hamilton", 2, "2021"));
		corredores.addPerson(new User(3, "Max", "Verstappen", 2, "2022"));
		corredores.addPerson(new User(4, "Kevin", "Chadgunssenn", 2, "0"));
		usuario.addAttribute("User", corredores.getUser());	
		return "index";
	}
	
	@GetMapping("/usuarios/{id}")
	public String save(Model model) {
		
		return "info";
	}
	

	@PutMapping("/usuarios")
	public void update(@RequestBody User persona) {
		userService.save(persona);
	}
}
