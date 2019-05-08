package br.com.nextevolution.Liga.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
public class Time {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany
    private List<Atleta> atletas;
//	@ManyToMany
//    private List<Clube> clubes;
//	@ManyToMany
//    private List<Posicao> posicoes;
//	@ManyToMany
//    private List<Status> status;
    private int capitao_id;
    @OneToOne
    private Cartoleiro time;
    private double patrimonio;
    private int esquema_id;
    private double pontos;
    private double valor_time;
    private int rodada_atual;
    private double variacao_patrimonio;
    private double variacao_pontos;    
    private int total_ligas;
    private int total_ligas_matamata;
    
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
//	public List<Clube> getClubes() {
//		return clubes;
//	}
//	public void setClubes(List<Clube> clubes) {
//		this.clubes = clubes;
//	}
//	public List<Posicao> getPosicoes() {
//		return posicoes;
//	}
//	public void setPosicoes(List<Posicao> posicoes) {
//		this.posicoes = posicoes;
//	}
//	public List<Status> getStatus() {
//		return status;
//	}
//	public void setStatus(List<Status> status) {
//		this.status = status;
//	}
	public int getCapitao_id() {
		return capitao_id;
	}
	public void setCapitao_id(int capitao_id) {
		this.capitao_id = capitao_id;
	}
	public Cartoleiro getTime() {
		return time;
	}
	public void setTime(Cartoleiro time) {
		this.time = time;
	}
	public double getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}
	public int getEsquema_id() {
		return esquema_id;
	}
	public void setEsquema_id(int esquema_id) {
		this.esquema_id = esquema_id;
	}
	public double getPontos() {
		return pontos;
	}
	public void setPontos(double pontos) {
		this.pontos = pontos;
	}
	public double getValor_time() {
		return valor_time;
	}
	public void setValor_time(double valor_time) {
		this.valor_time = valor_time;
	}
	public int getRodada_atual() {
		return rodada_atual;
	}
	public void setRodada_atual(int rodada_atual) {
		this.rodada_atual = rodada_atual;
	}
	public double getVariacao_patrimonio() {
		return variacao_patrimonio;
	}
	public void setVariacao_patrimonio(double variacao_patrimonio) {
		this.variacao_patrimonio = variacao_patrimonio;
	}
	public double getVariacao_pontos() {
		return variacao_pontos;
	}
	public void setVariacao_pontos(double variacao_pontos) {
		this.variacao_pontos = variacao_pontos;
	}
	public int getTotal_ligas() {
		return total_ligas;
	}
	public void setTotal_ligas(int total_ligas) {
		this.total_ligas = total_ligas;
	}
	public int getTotal_ligas_matamata() {
		return total_ligas_matamata;
	}
	public void setTotal_ligas_matamata(int total_ligas_matamata) {
		this.total_ligas_matamata = total_ligas_matamata;
	} 
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
	    if (!(obj instanceof Time)) return false;
	    Time that = (Time) obj;
	    return Objects.equals(id, that.id) &&
	    		Objects.equals(time, that.time);
	}
}


