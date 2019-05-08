package br.com.nextevolution.Liga.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Posicao {
	@Id
	private int id;
	private String nome;
	private String abreviacao;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	
}
