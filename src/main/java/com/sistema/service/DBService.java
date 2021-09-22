package com.sistema.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

import com.sistema.ProjetoSistemaApplication;
import com.sistema.dominio.Categoria;
import com.sistema.dominio.Livro;
import com.sistema.repository.CategoriaRepository;
import com.sistema.repository.LivroRepository;

@Service
public class DBService  {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivroRepository livroRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSistemaApplication.class, args);
	}
	public void instanciaBaseDeDados() {
		
		
		
		
		Categoria cat1 = new Categoria(null, "Ação", "Livros de ação");

		Livro l1 = new Livro (null, "Jogos Vorazes", "Livro do jogos vorazes", cat1);

		cat1.getLivros().addAll(Arrays.asList(l1));
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(l1));
		
		
	}
	
}
