package br.com.nextevolution.Liga.model;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@JsonIgnoreProperties(ignoreUnknown=true)
public class Liga {	
	@Id
	@JsonProperty("liga_id")
	private int id;
	private int time_dono_id;
	private int clube_id;
    private String nome;
    private String descricao;
    private String slug;
    private String tipo;
    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(pattern="yyyy-MM-dd hh:mm:ss")
    private Calendar criacao;
    private String url_flamula_svg;
    private String url_flamula_png;
    private String url_trofeu_svg;
    private String url_trofeu_png;
    private int inicio_rodada;
    private int fim_rodada;
    private int quantidade_times;
    private String imagem;
    private String mes_ranking_num;
    private String mes_variacao_num;
    private String camp_ranking_num;
    private String camp_variacao_num;
    private String capitao_ranking_num;
    private String capitao_variacao_num;
    private String total_times_liga;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTime_dono_id() {
		return time_dono_id;
	}
	public void setTime_dono_id(int time_dono_id) {
		this.time_dono_id = time_dono_id;
	}
	public int getClube_id() {
		return clube_id;
	}
	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Calendar getCriacao() {
		return criacao;
	}
	public void setCriacao(Calendar criacao) {
		this.criacao = criacao;
	}
	public String getUrl_flamula_svg() {
		return url_flamula_svg;
	}
	public void setUrl_flamula_svg(String url_flamula_svg) {
		this.url_flamula_svg = url_flamula_svg;
	}
	public String getUrl_flamula_png() {
		return url_flamula_png;
	}
	public void setUrl_flamula_png(String url_flamula_png) {
		this.url_flamula_png = url_flamula_png;
	}
	public String getUrl_trofeu_svg() {
		return url_trofeu_svg;
	}
	public void setUrl_trofeu_svg(String url_trofeu_svg) {
		this.url_trofeu_svg = url_trofeu_svg;
	}
	public String getUrl_trofeu_png() {
		return url_trofeu_png;
	}
	public void setUrl_trofeu_png(String url_trofeu_png) {
		this.url_trofeu_png = url_trofeu_png;
	}
	public int getInicio_rodada() {
		return inicio_rodada;
	}
	public void setInicio_rodada(int inicio_rodada) {
		this.inicio_rodada = inicio_rodada;
	}
	public int getFim_rodada() {
		return fim_rodada;
	}
	public void setFim_rodada(int fim_rodada) {
		this.fim_rodada = fim_rodada;
	}
	public int getQuantidade_times() {
		return quantidade_times;
	}
	public void setQuantidade_times(int quantidade_times) {
		this.quantidade_times = quantidade_times;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getMes_ranking_num() {
		return mes_ranking_num;
	}
	public void setMes_ranking_num(String mes_ranking_num) {
		this.mes_ranking_num = mes_ranking_num;
	}
	public String getMes_variacao_num() {
		return mes_variacao_num;
	}
	public void setMes_variacao_num(String mes_variacao_num) {
		this.mes_variacao_num = mes_variacao_num;
	}
	public String getCamp_ranking_num() {
		return camp_ranking_num;
	}
	public void setCamp_ranking_num(String camp_ranking_num) {
		this.camp_ranking_num = camp_ranking_num;
	}
	public String getCamp_variacao_num() {
		return camp_variacao_num;
	}
	public void setCamp_variacao_num(String camp_variacao_num) {
		this.camp_variacao_num = camp_variacao_num;
	}
	public String getCapitao_ranking_num() {
		return capitao_ranking_num;
	}
	public void setCapitao_ranking_num(String capitao_ranking_num) {
		this.capitao_ranking_num = capitao_ranking_num;
	}
	public String getCapitao_variacao_num() {
		return capitao_variacao_num;
	}
	public void setCapitao_variacao_num(String capitao_variacao_num) {
		this.capitao_variacao_num = capitao_variacao_num;
	}
	public String getTotal_times_liga() {
		return total_times_liga;
	}
	public void setTotal_times_liga(String total_times_liga) {
		this.total_times_liga = total_times_liga;
	}
	
	@Override
    public boolean equals(Object obj) {
		if (obj == this) return true;
    	if (! (obj instanceof Liga) ) return false;
    	Liga that = (Liga) obj;
    	return Objects.equals(slug, that.slug);
    }
    
    @Override
    public int hashCode() {
    	return slug.hashCode();
    }
    
    @Override
    public String toString() {
    	System.out.println("id :" +id);
    	System.out.println("nome: "+ nome);
    	System.out.println("Flamula: "+url_flamula_png);
    	System.out.println("quant Times: "+ quantidade_times);
    	System.out.println("dono: "+ time_dono_id);
    	return super.toString();
    }
}
