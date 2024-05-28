package com.query.Xpto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.query.Xpto.entities.Livros;
import com.query.Xpto.servicies.LivrosServices;

@RestController
@RequestMapping("/Livros")
public class LivrosController {
	private final LivrosServices LivrosService;

	@Autowired
	public LivrosController(LivrosServices LivrosService) {
		this.LivrosService = LivrosService;
	}

	@PostMapping
	public Livros createProduct(@RequestBody Livros Livros) {
		return LivrosService.saveLivros(Livros);
	}

	@GetMapping("/{id}")
	public Livros getLivros(@PathVariable Long id) {
		return LivrosService.getLivrosById(id);
	}

	@GetMapping
	public List<Livros> getAllLivross() {
		return LivrosService.getAllLivross();
	}

	@DeleteMapping("/{id}")
	public void deleteLivros(@PathVariable Long id) {
		LivrosService.deleteLivros(id);
	}
}
