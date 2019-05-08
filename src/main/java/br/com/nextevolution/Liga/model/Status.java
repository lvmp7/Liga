package br.com.nextevolution.Liga.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Status {
	@Id
	private int id;
	private String nome;
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
}
