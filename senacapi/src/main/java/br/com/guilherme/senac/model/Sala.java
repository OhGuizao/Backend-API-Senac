package br.com.guilherme.senac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Crinado a tabela "sala" para o Mysql-DB
@Entity
public class Sala {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idSala;

	@Column(length = 30, nullable = false)
	private String localSala;

	@Column(length = 100)
	private String idPatrimonio;

	@Column(length = 100)
	private String descricaoSala;

//Constructor using filds(no data)	
	public Sala() {
	}

//Constructor using filds(with data)
	public Sala(Long idSala, String localSala, String idPatrimonio, String descricaoSala) {
		this.idSala = idSala;
		this.localSala = localSala;
		this.idPatrimonio = idPatrimonio;
		this.descricaoSala = descricaoSala;
	}

//Getters and Setters
	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}

	public String getLocalSala() {
		return localSala;
	}

	public void setLocalSala(String localSala) {
		this.localSala = localSala;
	}

	public String getIdPatrimonio() {
		return idPatrimonio;
	}

	public void setIdPatrimonio(String idPatrimonio) {
		this.idPatrimonio = idPatrimonio;
	}

	public String getDescricaoSala() {
		return descricaoSala;
	}

	public void setDescricaoSala(String descricaoSala) {
		this.descricaoSala = descricaoSala;
	}

}
