package br.com.voejota.logbook.dataprovider.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VooModel implements Serializable {

	private static final long serialVersionUID = -3290719728539316543L;

	@Id
	private long id;
	private AeroportoModel aeroportoPartida;
	private AeroportoModel aeroportoChegada;
	private AeroportoModel aeroportoAlternativo;
	private AeronaveModel aeronaveUtilizada;
	private LocalTime tempoEstimado;
	private LocalTime tempoTotal;
	private LocalDateTime dataDecolagem;
	private LocalDateTime dataAterrissagem;
	private int quantidadePassageiros;
	private double quantidadeCombustivel;
	private String rota;

	public AeroportoModel getAeroportoPartida() {
		return aeroportoPartida;
	}
	public void setAeroportoPartida(AeroportoModel aeroportoPartida) {
		this.aeroportoPartida = aeroportoPartida;
	}
	public AeroportoModel getAeroportoChegada() {
		return aeroportoChegada;
	}
	public void setAeroportoChegada(AeroportoModel aeroportoChegada) {
		this.aeroportoChegada = aeroportoChegada;
	}
	public AeroportoModel getAeroportoAlternativo() {
		return aeroportoAlternativo;
	}
	public void setAeroportoAlternativo(AeroportoModel aeroportoAlternativo) {
		this.aeroportoAlternativo = aeroportoAlternativo;
	}
	public AeronaveModel getAeronaveUtilizada() {
		return aeronaveUtilizada;
	}
	public void setAeronaveUtilizada(AeronaveModel aeronaveUtilizada) {
		this.aeronaveUtilizada = aeronaveUtilizada;
	}
	public LocalTime getTempoEstimado() {
		return tempoEstimado;
	}
	public void setTempoEstimado(LocalTime tempoEstimado) {
		this.tempoEstimado = tempoEstimado;
	}
	public LocalTime getTempoTotal() {
		return tempoTotal;
	}
	public void setTempoTotal(LocalTime tempoTotal) {
		this.tempoTotal = tempoTotal;
	}
	public LocalDateTime getDataDecolagem() {
		return dataDecolagem;
	}
	public void setDataDecolagem(LocalDateTime dataDecolagem) {
		this.dataDecolagem = dataDecolagem;
	}
	public LocalDateTime getDataAterrissagem() {
		return dataAterrissagem;
	}
	public void setDataAterrissagem(LocalDateTime dataAterrissagem) {
		this.dataAterrissagem = dataAterrissagem;
	}
	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}
	public void setQuantidadePassageiros(int quantidadePassageiros) {
		this.quantidadePassageiros = quantidadePassageiros;
	}
	public double getQuantidadeCombustivel() {
		return quantidadeCombustivel;
	}
	public void setQuantidadeCombustivel(double quantidadeCombustivel) {
		this.quantidadeCombustivel = quantidadeCombustivel;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
}
