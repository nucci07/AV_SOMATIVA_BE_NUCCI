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

import com.query.Xpto.entities.Autor;
import com.query.Xpto.servicies.AutorServices;

@RestController
@RequestMapping("/Autor")
public class AutorController {
	@Autowired
	private final AutorServices AutorService;

	@Autowired
	public AutorController(AutorServices AutorService) {
		this.AutorService = AutorService;
	}

	@PostMapping
	public Autor createProduct(@RequestBody Autor Autor) {
		return AutorService.saveAutor(Autor);
	}

	@GetMapping("/{idAutor}")
	public Autor getAutor(@PathVariable Long id) {
		return AutorService.getAutorById(id);
	}

	@GetMapping
	public List<Autor> getAllAutors() {
		return AutorService.getAllAutors();
	}

	@DeleteMapping("/{idAutor}")
	public void deleteAutor(@PathVariable Long id) {
		AutorService.deleteAutor(id);
	}
}
