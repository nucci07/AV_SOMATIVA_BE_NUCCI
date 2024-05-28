package com.query.Xpto.servicies;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.query.Xpto.entities.Autor;
import com.query.Xpto.repositories.AutorRepository;

@Service
public class AutorServices {
	private final AutorRepository autorRepository;

	// construtor que recebe a dependencia
	@Autowired
	public AutorServices(AutorRepository autorRepository) {
		this.autorRepository = autorRepository;
	}

	public Autor saveAutor(Autor Autor) {
		return autorRepository.save(Autor);
	}

	public Autor getAutorById(Long idAutor) {
		return autorRepository.findById(idAutor).orElse(null);
	}

	public List<Autor> getAllAutors() {
		return autorRepository.findAll();
	}

	public void deleteAutor(Long idAutor) {
		autorRepository.deleteById(idAutor);
	}
}