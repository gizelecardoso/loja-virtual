package br.com.loja.Vo;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import br.com.loja.model.Produtos;

public class ProdutosVo {
	
	private long id;
	private String nome;
	private String descricao;
	private double preco;
	
	public ProdutosVo(Produtos produtos) {
		this.id = produtos.getId();
		this.nome = produtos.getNome();
		this.descricao = produtos.getDescricao();
		this.preco = produtos.getPreco();
		
	}
	
	public long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}

	public static List<ProdutosVo> converter(List<Produtos> produtos) {
		return produtos.stream().map(ProdutosVo::new).collect(Collectors.toList());
	}
	
	

}
