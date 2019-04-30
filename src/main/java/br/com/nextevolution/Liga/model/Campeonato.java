package br.com.nextevolution.Liga.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Campeonato {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Id;
	private String nome;
	@OneToMany(fetch=FetchType.EAGER,cascade= {CascadeType.PERSIST,CascadeType.REMOVE})
	private List<Cartoleiro> cartola;
	@ManyToOne
	private Rodada inicio;
	@ManyToOne
	private Rodada fim;
	private String descricao;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Cartoleiro> getCartola() {
		return cartola;
	}
	public void setCartola(List<Cartoleiro> cartola) {
		this.cartola = cartola;
	}
	public Rodada getInicio() {
		return inicio;
	}
	public void setInicio(Rodada inicio) {
		this.inicio = inicio;
	}
	public Rodada getFim() {
		return fim;
	}
	public void setFim(Rodada fim) {
		this.fim = fim;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(nome+"\n");
		str.append("inicio: Rodada "+inicio.getId()+"\n");
		str.append("fim: Rodada "+fim.getId()+"\n");
		str.append("Descricao: "+descricao);
		
		return str.toString();
	}

}
