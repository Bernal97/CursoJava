package com.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.web.entity.Monoplaza;
import com.app.web.service.IMonoplazaService;


@Controller
@RequestMapping("/views/monoplazas")
public class MonoplazaController {


	@Autowired
	private IMonoplazaService dbUtility;
	
	@GetMapping("/")
	public String listUsuarios(Model modelo, @Param("equipoClave") String equipoClave) {
		List<Monoplaza> listadoUsuarios = dbUtility.listAll(equipoClave);
		modelo.addAttribute("Titulo", "Listado Monoplazas");
		modelo.addAttribute("Monoplaza", listadoUsuarios);
		modelo.addAttribute("equipoClave", equipoClave);
		return "/views/monoplazas/listarMonoplazas";
	}
	
	
	@GetMapping("/create")
	public String create(Model modelo) {
		Monoplaza vehiculo = new Monoplaza();
		modelo.addAttribute("Titulo", "Crear Monoplaza");
		modelo.addAttribute("Monoplaza", vehiculo);		
		return "views/monoplazas/formMonoplazas";
	}
	
	@PostMapping("/save")
	public String save(@Validated@ModelAttribute Monoplaza monoplaza) {
		dbUtility.save(monoplaza);
		return "redirect:/views/monoplazas/";
	}
	
	
	
	@GetMapping("/editar/{id}")
	public ModelAndView editarUsuario(@PathVariable(name = "id") Long id) {
		ModelAndView modelo = new ModelAndView("/views/monoplazas/editMonoplaza");
		
		Monoplaza persona = dbUtility.findById(id);
		modelo.addObject("Monoplaza", persona);
		return modelo;
	}
	
	@GetMapping("/eliminar/{id}")
	public String eliminarUsuario(@PathVariable(name = "id") Long id) {
		dbUtility.delete(id);
		return "redirect:/views/monoplazas/";
	}
	
}
