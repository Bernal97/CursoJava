package com.app.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.web.entity.Usuario;
import com.app.web.service.IUsuarioService;

@Controller
@RequestMapping("/")
public class UsuarioController {

	
	@Autowired
	IUsuarioService usuarioService;
	
	
	@GetMapping("/create")
	public String crearUser(Model modelo) {
		Usuario user = new Usuario();
		modelo.addAttribute("Usuario", user);
		return "registro";
	}
	
	/*
	
	@GetMapping("/login")
	public String logUser(@ModelAttribute Usuario user,Model modelo) {
		
		if(usuarioService.Auth(user)) {
			return "redirect:/views/corredores/";
		}
		return "login";
	}
	
	
	*/
}
