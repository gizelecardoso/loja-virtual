package br.com.loja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.loja.model.Produtos;


@Repository
public interface LojaRepository extends JpaRepository<Produtos, Integer>{

	
}
