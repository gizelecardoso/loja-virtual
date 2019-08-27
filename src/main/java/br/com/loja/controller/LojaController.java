package br.com.loja.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.loja.Vo.ProdutosVo;
import br.com.loja.model.Produtos;
import br.com.loja.repository.LojaRepository;

@RestController
public class LojaController{

	
	@Autowired
	public LojaRepository lojaRepository;
	
	@RequestMapping("/produtos")
	@ResponseBody
	public List<ProdutosVo> paginaInicial() {
		
		List<Produtos> produtos = lojaRepository.findAll();
		
		return ProdutosVo.converter(produtos);
	}
	
}
