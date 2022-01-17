package br.com.voejota.logbook.dataprovider.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AeronaveModelId implements Serializable {

	private static final long serialVersionUID = 4637118811509910065L;

	@Column(name = "id")
	private long id;
	
	@Column(name = "matricula")
	private String matricula;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
