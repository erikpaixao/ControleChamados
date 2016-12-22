package paixao.erik.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Chamado {
	@Id
	private Integer numChamado;
	private String descChamado;
	@ManyToOne
	@JsonIgnore
	private Pessoa solicitante;
	
	public Chamado() {}

	public Integer getNumChamado() {
		return numChamado;
	}

	public void setNumChamado(Integer numChamado) {
		this.numChamado = numChamado;
	}

	public String getDescChamado() {
		return descChamado;
	}

	public void setDescChamado(String descChamado) {
		this.descChamado = descChamado;
	}

	public Pessoa getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Pessoa solicitante) {
		this.solicitante = solicitante;
	}
	
	
}
