package br.com.brenomorais.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	/*
	 * Método carrega a pagina index.html de login do sistema
	 */	
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}
	
	
	/*
	 * Redireciona para à pagina home após o login
	 */	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String home() {
		return "home";
	}
	
	/*
	 * Redireciona quando o usuário não tive permissão para alguma função
	 */		
	@RequestMapping(value="/acessoNegado", method= RequestMethod.GET)
	public String acessoNegado(){ 
		return "acessoNegado";
	}

}
