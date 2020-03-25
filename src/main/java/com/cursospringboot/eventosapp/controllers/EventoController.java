package com.cursospringboot.eventosapp.controllers;

import com.cursospringboot.eventosapp.models.Evento;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EventoController {

	@RequestMapping("/cadastrarEvento")
	public String form() { return "formEvento";	}

	@RequestMapping(name = "/salvarEvento", method = RequestMethod.POST)
	public String salvar( Evento evento) {
		System.out.println(evento.getNome());
		return "formEvento"; }

}
