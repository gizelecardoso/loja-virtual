package br.com.loja;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.loja.controller"})
public class LojaConfiguration{

	public static void main(String[] args) {
		
		SpringApplication.run(LojaConfiguration.class, args);
	}
}
