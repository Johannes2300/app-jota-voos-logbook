package br.com.voejota.logbook.dataprovider.model;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tb_aeroporto")
public class AeroportoModel implements Serializable {

	private static final long serialVersionUID = 1627290016801570565L;

	@Id
	private long id;
	
	@Column(name = "ICAO")
	private String ICAO;
	
	@Column(name = "IATA")
	private String IATA;

	@Column(name = "nome")
	private String nome;

	@Transient
	private List<String> pistas;
	
	@Column(name = "horarioInicioOperacao")
	private LocalTime horarioInicioOperacao;

	@Column(name = "horarioFimOperacao")
	private LocalTime horarioFimOperacao;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getICAO() {
		return ICAO;
	}
	public void setICAO(String iCAO) {
		this.ICAO = iCAO;
	}
	public String getIATA() {
		return IATA;
	}
	public void setIATA(String IATA) {
		this.IATA = IATA;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getPistas() {
		return pistas;
	}
	public void setPistas(List<String> pistas) {
		this.pistas = pistas;
	}
	public LocalTime getHorarioInicioOperacao() {
		return horarioInicioOperacao;
	}
	public void setHorarioInicioOperacao(LocalTime horarioInicioOperacao) {
		this.horarioInicioOperacao = horarioInicioOperacao;
	}
	public LocalTime getHorarioFimOperacao() {
		return horarioFimOperacao;
	}
	public void setHorarioFimOperacao(LocalTime horarioFimOperacao) {
		this.horarioFimOperacao = horarioFimOperacao;
	}
	
}
