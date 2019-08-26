package br.com.loja.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LojaController{

	@RequestMapping("/teste")
	@ResponseBody
	public String paginaInicial() {
		return "Testando o inicio do projeto";
	}
	
}
