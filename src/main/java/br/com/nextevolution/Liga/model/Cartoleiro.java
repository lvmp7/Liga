package br.com.nextevolution.Liga.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Cartoleiro implements Comparable<Cartoleiro>{
	@Id
	@JsonProperty("time_id")
	private long id;
	private int clube_id;
	private int esquema_id;
	private String foto_perfil;
	private String nome;
	private String nome_cartola;
	private String slug;
	private String url_escudo_svg;
	private String url_escudo_png;
	private String url_camisa_svg;
	private String url_camisa_png;
	private String temporada_inicial;
	private double patrimonio;
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.ALL})
	@JoinColumn(name="idRanking")
	private Ranking ranking;
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.ALL})
	@JoinColumn(name="idPontos")
	private Pontos pontos;
	@ManyToOne(fetch=FetchType.EAGER,cascade={CascadeType.ALL})
	@JoinColumn(name="idVariacao")
	private Variacao variacao;
	@OneToOne(mappedBy="time")
	private Time time;
	@OneToMany
	private List<Pontos> pontuacao;
	
	public long getTime_id() {
		return id;
	}
	public void setTime_id(long id) {
		this.id = id;
	}
	public int getClube_id() {
		return clube_id;
	}
	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
	}
	public int getEsquema_id() {
		return esquema_id;
	}
	public void setEsquema_id(int esquema_id) {
		this.esquema_id = esquema_id;
	}
	public String getFoto_perfil() {
		return foto_perfil;
	}
	public void setFoto_perfil(String foto_perfil) {
		this.foto_perfil = foto_perfil;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome_cartola() {
		return nome_cartola;
	}
	public void setNome_cartola(String nome_cartola) {
		this.nome_cartola = nome_cartola;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getUrl_escudo_svg() {
		return url_escudo_svg;
	}
	public void setUrl_escudo_svg(String url_escudo_svg) {
		this.url_escudo_svg = url_escudo_svg;
	}
	public String getUrl_escudo_png() {
		return url_escudo_png;
	}
	public void setUrl_escudo_png(String url_escudo_png) {
		this.url_escudo_png = url_escudo_png;
	}
	public String getUrl_camisa_svg() {
		return url_camisa_svg;
	}
	public void setUrl_camisa_svg(String url_camisa_svg) {
		this.url_camisa_svg = url_camisa_svg;
	}
	public String getUrl_camisa_png() {
		return url_camisa_png;
	}
	public void setUrl_camisa_png(String url_camisa_png) {
		this.url_camisa_png = url_camisa_png;
	}
	public String getTemporada_inicial() {
		return temporada_inicial;
	}
	public void setTemporada_inicial(String temporada_inicial) {
		this.temporada_inicial = temporada_inicial;
	}
	public double getPatrimonio() {
		return patrimonio;
	}
	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}
	public Ranking getRanking() {
		return ranking;
	}
	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}
	public Pontos getPontos() {
		return pontos;
	}
	public void setPontos(Pontos pontos) {
		this.pontos = pontos;
	}
	public Variacao getVariacao() {
		return variacao;
	}
	public void setVariacao(Variacao variacao) {
		this.variacao = variacao;
	}
	
	public Time getTime() {
		return time;
	}
	
	public void setTime(Time time) {
		this.time = time;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
    	if (! (obj instanceof Cartoleiro) ) return false;
    	Cartoleiro that = (Cartoleiro) obj;
    	return Objects.equals(slug, that.slug); 
    }
	
	@Override
	public int hashCode() {
		return this.slug.hashCode();
	}
	public int compareTo(Cartoleiro outro) {
		return Double.compare(this.pontos.getCampeonato(), outro.pontos.getCampeonato());
	}
	
	public List<Pontos> getPontuacao() {
		return pontuacao;
	}
	
	public void setPontuacao(List<Pontos> pontuacao) {
		this.pontuacao = pontuacao;
	}
	
	public void addPontuacao(int rodada ,Double pontos){
		Pontos p = new Pontos();
		p.setId(rodada);
		p.setRodada(rodada);
		
		pontuacao.add(p);
	}
	
}
