package com.coutomariel.breuer.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.coutomariel.breuer.model.Cerveja;

@Controller
@RequestMapping("/cervejas")
public class CervejasController {

	@RequestMapping("/nova")
	public String novo(){
		return "cerveja/CadastroCerveja";
	}
	
	@RequestMapping(value="/nova", method = RequestMethod.POST)
	public String salvar(@Valid Cerveja cerveja, BindingResult result, Model model, RedirectAttributes attributes){
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário");
			return "cerveja/CadastroCerveja";
		}

		attributes.addFlashAttribute("mensagem", "Cerveja salvo com sucesso!");
		return "redirect:/cervejas/nova";
	}
}
