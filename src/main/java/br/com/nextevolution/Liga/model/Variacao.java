package br.com.nextevolution.Liga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Variacao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int mes;
	private int turno;
	private int campeonato;
	private int patrimonio;
	
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getTurno() {
		return turno;
	}
	public void setTurno(int turno) {
		this.turno = turno;
	}
	public int getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(int campeonato) {
		this.campeonato = campeonato;
	}
	public int getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
