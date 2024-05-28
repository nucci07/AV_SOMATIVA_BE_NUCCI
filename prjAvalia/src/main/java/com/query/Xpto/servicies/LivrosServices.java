package com.query.Xpto.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.Xpto.entities.Livros;
import com.query.Xpto.repositories.LivrosRepository;

@Service
public class LivrosServices {
	private final LivrosRepository livrosRepository;

	// construtor que recebe a dependencia
	@Autowired
	public LivrosServices(LivrosRepository livrosRepository) {
		this.livrosRepository = livrosRepository;
	}

	public Livros saveLivros(Livros Livros) {
		return livrosRepository.save(Livros);
	}

	public Livros getLivrosById(Long id) {
		return livrosRepository.findById(id).orElse(null);
	}

	public List<Livros> getAllLivross() {
		return livrosRepository.findAll();
	}

	public void deleteLivros(Long id) {
		livrosRepository.deleteById(id);
	}

}