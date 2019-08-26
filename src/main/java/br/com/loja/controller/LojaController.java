package br.com.loja.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.Vo.ProdutosVo;
import br.com.loja.model.Produtos;

@RestController
public class LojaController{

	@RequestMapping("/teste")
	@ResponseBody
	public List<ProdutosVo> paginaInicial() {
		Produtos produto = new Produtos("Celula", "Samsung Galaxy ...", 940.00);
		
		return ProdutosVo.converter(Arrays.asList(produto, produto, produto));
	}
	
}
