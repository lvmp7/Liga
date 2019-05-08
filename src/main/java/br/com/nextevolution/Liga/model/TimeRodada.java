package br.com.nextevolution.Liga.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class TimeRodada {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="atleta_id")
	private List<Atleta> atletas;
	@JsonProperty("capitao_id")
	private int capitao;
	@OneToOne
	@JsonProperty("time")
	private Cartoleiro cartoleiro;
	@JsonProperty("rodada_atual")
	private int rodada;
	private double pontos;
	private double patrimonio;
	
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public int getCapitao() {
		return capitao;
	}
	public void setCapitao(int capitao) {
		this.capitao = capitao;
	}
	public Cartoleiro getTime() {
		return cartoleiro;
	}
	public void setTime(Cartoleiro cartoleiro) {
		this.cartoleiro = cartoleiro;
	}
	public int getRodada() {
		return rodada;
	}
	public void setRodada(int rodada) {
		this.rodada = rodada;
	}
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	public double getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(! (obj instanceof TimeRodada)) return false;
		TimeRodada that = (TimeRodada) obj;
		return Integer.compare(id, that.id) ==0 ? true:false;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
