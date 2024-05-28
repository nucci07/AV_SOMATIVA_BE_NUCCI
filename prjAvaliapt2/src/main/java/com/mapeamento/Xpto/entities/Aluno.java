package com.mapeamento.Xpto.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

	@Entity
	@Table(name = "aluno")
	public class Aluno {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String nome;
	    private String ra;
	    private String email;
	    private String telefone;
	    private String cidade;
	    private double renda;
	    
	    @ManyToOne
	    @Column(name = "id_turma")
	    private Turma turma; {
		}
	    
	}
