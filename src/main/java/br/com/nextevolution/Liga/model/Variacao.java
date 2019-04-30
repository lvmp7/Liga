package br.com.nextevolution.Liga.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Variacao {
	
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

}
