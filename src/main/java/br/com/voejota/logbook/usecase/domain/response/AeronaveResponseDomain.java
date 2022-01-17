package br.com.voejota.logbook.usecase.domain.response;

import java.time.LocalDateTime;

public class AeronaveResponseDomain {
	
	private long id;
	private String marca;
	private String modelo;
	private String matricula;
	private int milhasVoadas;
	private LocalDateTime ultimoVoo;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public int getMilhasVoadas() {
		return milhasVoadas;
	}
	public void setMilhasVoadas(int milhasVoadas) {
		this.milhasVoadas = milhasVoadas;
	}
	public LocalDateTime getUltimoVoo() {
		return ultimoVoo;
	}
	public void setUltimoVoo(LocalDateTime ultimoVoo) {
		this.ultimoVoo = ultimoVoo;
	}
	
}
