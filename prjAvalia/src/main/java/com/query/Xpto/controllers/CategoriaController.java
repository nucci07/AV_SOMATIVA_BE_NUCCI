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

import com.query.Xpto.entities.Categoria;
import com.query.Xpto.servicies.CategoriaService;

@RestController
@RequestMapping("/Categoria")
public class CategoriaController {
	private final CategoriaService CategoriaService;

	@Autowired
	public CategoriaController(CategoriaService CategoriaService) {
		this.CategoriaService = CategoriaService;
	}

	@PostMapping
	public Categoria createProduct(@RequestBody Categoria Categoria) {
		return CategoriaService.saveCategoria(Categoria);
	}

	@GetMapping("/{idCategoria}")
	public Categoria getCategoria(@PathVariable Long id) {
		return CategoriaService.getCategoriaById(id);
	}

	@GetMapping
	public List<Categoria> getAllCategorias() {
		return CategoriaService.getAllCategorias();
	}

	@DeleteMapping("/{idCategoria}")
	public void deleteCategoria(@PathVariable Long id) {
		CategoriaService.deleteCategoria(id);
	}
}
