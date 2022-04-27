package com.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.mvc.model.CartaModel;
import com.mvc.model.MazoModel;

@Controller

public class YuGiOhController {

	
	@GetMapping("/ygo")
	public String index (Model modelo) {
		MazoModel unMazo = new MazoModel("exodia");
		unMazo.addCarta(new CartaModel(1, "CabezaExodia", "Mounstruo"));
		unMazo.addCarta(new CartaModel(2, "BrazoDerechoExodia", "Mounstruo"));
		unMazo.addCarta(new CartaModel(3, "BrazoIzquierdoExodia", "Mounstruo"));
		unMazo.addCarta(new CartaModel(4, "PiernaDerechaExodia", "Mounstruo"));
		unMazo.addCarta(new CartaModel(5, "PiernaIzquierdaExodia", "Mounstruo"));
		unMazo.addCarta(new CartaModel(6, "JarraDeLaCodicia", "Hechizo"));
		unMazo.addCarta(new CartaModel(7, "JarraDeLaCodicia", "Hechizo"));
		unMazo.addCarta(new CartaModel(8, "FuerzaDeEspejo", "Trampa"));
		unMazo.addCarta(new CartaModel(9, "FuerzaDeEspejo", "Trampa"));
		modelo.addAttribute("Mazo", unMazo);
		System.out.println(unMazo.getMazo().toString());
		modelo.addAttribute("Mano", unMazo.getMano());
		modelo.addAttribute("ListaCartas", unMazo.getMazo());
		return "index";
	}
	
	
}
