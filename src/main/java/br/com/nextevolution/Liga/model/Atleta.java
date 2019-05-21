package br.com.nextevolution.Liga.model;

import java.util.Objects;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity	
public class Atleta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@JsonProperty("atleta_id")
	private int idAtleta;
	@JsonProperty("rodada_id")
	private int rodadaId;
	@JsonProperty("clube_id")
	private int clubeId;
	private String nome;
	private String slug;
	private String apelido;
	private String foto;
	private int posicao_id;
	private int status_id;
	private int pontos_num;
	private int preco_num;
	private int variacao_num;
	private int media_num;
	private int jogos_num;
	@Embedded
	private Scout scout;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAtletaId() {
		return idAtleta;
	}
	public void setAtletaId(int idAtleta) {
		this.idAtleta = idAtleta;
	}
	public int getRodadaId() {
		return rodadaId;
	}
	public void setRodadaId(int rodadaId) {
		this.rodadaId = rodadaId;
	}
	public int getClubeId() {
		return clubeId;
	}
	public void setClubeId(int clubeId) {
		this.clubeId = clubeId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getAtleta_id() {
		return id;
	}
	public void setAtleta_id(int atleta_id) {
		this.id = atleta_id;
	}
	public int getPosicao_id() {
		return posicao_id;
	}
	public void setPosicao_id(int posicao_id) {
		this.posicao_id = posicao_id;
	}
	public int getStatus_id() {
		return status_id;
	}
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	public int getPontos_num() {
		return pontos_num;
	}
	public void setPontos_num(int pontos_num) {
		this.pontos_num = pontos_num;
	}
	public int getPreco_num() {
		return preco_num;
	}
	public void setPreco_num(int preco_num) {
		this.preco_num = preco_num;
	}
	public int getVariacao_num() {
		return variacao_num;
	}
	public void setVariacao_num(int variacao_num) {
		this.variacao_num = variacao_num;
	}
	public int getMedia_num() {
		return media_num;
	}
	public void setMedia_num(int media_num) {
		this.media_num = media_num;
	}
	public int getJogos_num() {
		return jogos_num;
	}
	public void setJogos_num(int jogos_num) {
		this.jogos_num = jogos_num;
	}
	public Scout getScout() {
		return scout;
	}
	public void setScout(Scout scout) {
		this.scout = scout;
	}
    
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if( !(obj instanceof Atleta)) return false;
		Atleta that = (Atleta) obj;
		return (Integer.compare(idAtleta,that.idAtleta)==0 && (Integer.compare(rodadaId, rodadaId)==0) ) ;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(slug,idAtleta,rodadaId);
	}
}