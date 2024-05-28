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
public class Autor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAutor;

	private String Nome;

	private String País;

	public Autor(Long idAutor, String nome, String país) {
		super();
		this.idAutor = idAutor;
		Nome = nome;
		País = país;
	}

	public Long getIdAutor() {
		return idAutor;
	}

	public void setIdAutor(Long idAutor) {
		this.idAutor = idAutor;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getPaís() {
		return País;
	}

	public void setPaís(String país) {
		País = país;
	}

}
