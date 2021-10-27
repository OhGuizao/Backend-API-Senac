package br.com.guilherme.senac.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Crinado a tabela "patrimonio" para o Mysql-DB
@Entity
public class Patrimonio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPatrimonio;

	@Column(nullable = false)
	private Long idSala;

	@Column(length = 50, nullable = false)
	private String nomePatrimonio;

	@Column(length = 15, nullable = false)
	private String valorPatrimonio;

	@Column(length = 100)
	private String descricaoPatrimonio;

//Constructor using filds(no data)
	public Patrimonio() {
	}

//Constructor using filds(with data)
	public Patrimonio(Long idPatrimonio, Long idSala, String nomePatrimonio, String valorPatrimonio,
			String descricaoPatrimonio) {
		this.idPatrimonio = idPatrimonio;
		this.idSala = idSala;
		this.nomePatrimonio = nomePatrimonio;
		this.valorPatrimonio = valorPatrimonio;
		this.descricaoPatrimonio = descricaoPatrimonio;
	}

//Getters and Setters
	public Long getIdPatrimonio() {
		return idPatrimonio;
	}

	public void setIdPatrimonio(Long idPatrimonio) {
		this.idPatrimonio = idPatrimonio;
	}

	public Long getIdSala() {
		return idSala;
	}

	public void setIdSala(Long idSala) {
		this.idSala = idSala;
	}

	public String getNomePatrimonio() {
		return nomePatrimonio;
	}

	public void setNomePatrimonio(String nomePatrimonio) {
		this.nomePatrimonio = nomePatrimonio;
	}

	public String getValorPatrimonio() {
		return valorPatrimonio;
	}

	public void setValorPatrimonio(String valorPatrimonio) {
		this.valorPatrimonio = valorPatrimonio;
	}

	public String getDescricaoPatrimonio() {
		return descricaoPatrimonio;
	}

	public void setDescricaoPatrimonio(String descricaoPatrimonio) {
		this.descricaoPatrimonio = descricaoPatrimonio;
	}

}
