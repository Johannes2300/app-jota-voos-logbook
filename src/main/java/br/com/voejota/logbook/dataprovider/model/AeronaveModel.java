package br.com.voejota.logbook.dataprovider.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tb_aeronave")
public class AeronaveModel implements Serializable {

	private static final long serialVersionUID = -4624475299325732415L;

	@EmbeddedId
	private AeronaveModelId pk;
	
	@Column(name = "marca")
	private String marca;
	
	@Column(name = "modelo")
	private String modelo;

	@Column(name = "milhas_voadas")
	private int milhasVoadas;
	
	@Column(name = "ultimo_voo")
	private LocalDateTime ultimoVoo;
	
	public AeronaveModelId getPK() {
		return pk;
	}
	public void setPK(AeronaveModelId pk) {
		this.pk = pk;
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
