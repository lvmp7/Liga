package br.com.nextevolution.Liga.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Pontos {
	private double rodada;
	private double mes;
	private double turno;
	private double campeonato;
	public double getRodada() {
		return rodada;
	}
	public void setRodada(double rodada) {
		this.rodada = rodada;
	}
	public double getMes() {
		return mes;
	}
	public void setMes(double mes) {
		this.mes = mes;
	}
	public double getTurno() {
		return turno;
	}
	public void setTurno(double turno) {
		this.turno = turno;
	}
	public double getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(double campeonato) {
		this.campeonato = campeonato;
	}
	
	
}
