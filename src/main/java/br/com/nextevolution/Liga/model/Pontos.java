package br.com.nextevolution.Liga.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Pontos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private double rodada;
	private double mes;
	private double turno;
	private double campeonato;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
