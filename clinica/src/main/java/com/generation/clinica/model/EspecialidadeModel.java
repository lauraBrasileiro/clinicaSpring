package com.generation.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tbEspecialidade")
public class EspecialidadeModel {
	@Id //primary key
	@GeneratedValue(strategy=GenerationType.IDENTITY) //AUTOINCREMENTO
	private long codEspecialidade;
	
	@Column(name="nomeEspecialista", nullable=false, length=50)
	private String nomeEspecialidade;

	public long getCodEspecialidade() {
		return codEspecialidade;
	}

	public void setCodEspecialidade(long codEspecialidade) {
		this.codEspecialidade = codEspecialidade;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	
}
