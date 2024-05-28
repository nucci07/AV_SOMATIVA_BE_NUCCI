package com.query.Xpto.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.Xpto.entities.Categoria;
import com.query.Xpto.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	private final CategoriaRepository CategoriaRepository;

	// construtor que recebe a dependencia
	@Autowired
	public CategoriaService(CategoriaRepository CategoriaRepository) {
		this.CategoriaRepository = CategoriaRepository;
	}

	public Categoria saveCategoria(Categoria Categoria) {
		return CategoriaRepository.save(Categoria);
	}

	public Categoria getCategoriaById(Long idCategoria) {
		return CategoriaRepository.findById(idCategoria).orElse(null);
	}

	public List<Categoria> getAllCategorias() {
		return CategoriaRepository.findAll();
	}

	public void deleteCategoria(Long idCategoria) {
		CategoriaRepository.deleteById(idCategoria);
	}

}
