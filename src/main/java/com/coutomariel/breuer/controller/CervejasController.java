package com.coutomariel.breuer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cervejas")
public class CervejasController {

	@RequestMapping("/nova")
	public String novo(){
		return "cerveja/CadastroCerveja";
	}
}
