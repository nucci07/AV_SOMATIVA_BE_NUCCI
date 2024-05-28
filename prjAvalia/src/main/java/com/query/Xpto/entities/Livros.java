package com.query.Xpto.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Livros {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String titulo;

	private String ano;

	private String autor_idAutor;

	private String Categoria_idCategoria;

	public Livros(Long id, String titulo, String ano, String autor_idAutor, String categoria_idCategoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.autor_idAutor = autor_idAutor;
		Categoria_idCategoria = categoria_idCategoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getAutor_idAutor() {
		return autor_idAutor;
	}

	public void setAutor_idAutor(String autor_idAutor) {
		this.autor_idAutor = autor_idAutor;
	}

	public String getCategoria_idCategoria() {
		return Categoria_idCategoria;
	}

	public void setCategoria_idCategoria(String categoria_idCategoria) {
		Categoria_idCategoria = categoria_idCategoria;
	}

}
