package br.com.brenomorais.webapp.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
	
	//Método carrega a pagina index.html de login do sistema
	
	public String index() {
		return "index";
	}

}
