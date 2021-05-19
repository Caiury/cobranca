package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.TituloRepository;

@Controller()
@RequestMapping("/titulo")
public class TituloController {
	
@Autowired	
TituloRepository repository;	

	
	
	@RequestMapping("/novo")
	public String novo() {

		return "CadastroTitulo";
	}
	
	
	

	@RequestMapping("/salva")
	public String salva(Titulo titulo) {

  repository.save(titulo);
	
		return "CadastroTitulo";
	}
}
