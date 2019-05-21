package br.com.nextevolution.Liga.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Campeonato{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	private String nome;
	private int rodadaInicio;
	private int rodadaFim;
	private String descricao;
//	@Embedded
//	TabelaPontuacao tabela;
//	
	public Campeonato() {
	}

	public Campeonato(String nome, int rodadaInicio, int rodadaFim, String descricao) {
		this.nome = nome;
		this.rodadaInicio = rodadaInicio;
		this.rodadaFim = rodadaFim;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getInicio() {
		return rodadaInicio;
	}
	public void setInicio(int inicio) {
		this.rodadaInicio = inicio;
	}
	public int getFim() {
		return rodadaFim;
	}
	public void setFim(int fim) {
		this.rodadaFim = fim;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRodadaInicio() {
		return rodadaInicio;
	}

	public void setRodadaInicio(int rodadaInicio) {
		this.rodadaInicio = rodadaInicio;
	}

	public int getRodadaFim() {
		return rodadaFim;
	}

	public void setRodadaFim(int rodadaFim) {
		this.rodadaFim = rodadaFim;
	}
	
	public List<TimeRodada> vencedores(){
		List<TimeRodada> vencedores = new ArrayList<TimeRodada>();
		return vencedores;
	}
	
//	public TabelaPontuacao getTabela() {
//		return tabela;
//	}
//
//	public void setTabela(TabelaPontuacao tabela) {
//		this.tabela = tabela;
//	}

	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
    	if (! (obj instanceof Campeonato) ) return false;
    	Campeonato that = (Campeonato) obj;
    	return Objects.equals(id, that.id) ;
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(id,nome);
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append(nome+"\n");
		str.append("inicio: Rodada "+ rodadaInicio+"\n");
		str.append("fim: Rodada "+ rodadaFim+"\n");
		str.append("Descricao: "+ descricao);
		return str.toString();
	}
}
