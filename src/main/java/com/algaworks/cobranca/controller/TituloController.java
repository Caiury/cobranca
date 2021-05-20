package com.algaworks.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.model.StatusTitulo;
import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.TituloRepository;

@Controller()
@RequestMapping("/titulo")
public class TituloController {

	@Autowired
	TituloRepository repository;

	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("CadastroTitulo");

		return mv;
	}

	@RequestMapping("/salva")
	public ModelAndView salva(Titulo titulo) {

		repository.save(titulo);
		ModelAndView mc = new ModelAndView("CadastroTitulo");
		mc.addObject("mensagem", "Titulo Salvo com sucesso!");
		return mc;
	}

	@ModelAttribute("todosStatusTitulo")
	public List<StatusTitulo> todosStatusTitulo() {

		return Arrays.asList(StatusTitulo.values());

	}
}
