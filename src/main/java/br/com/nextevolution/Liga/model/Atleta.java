package br.com.nextevolution.Liga.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Atleta {
	private String nome;
	private String slug;
	private String apelido;
	private String foto;
	@Id
	private int atleta_id;
	private int rodada_id;
	private int clube_id;
	private int posicao_id;
	private int status_id;
	private int pontos_num;
	private int preco_num;
	private int variacao_num;
	private int media_num;
	private int jogos_num;
	@Embedded
    private Scout scout;
    
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
		return atleta_id;
	}
	public void setAtleta_id(int atleta_id) {
		this.atleta_id = atleta_id;
	}
	public int getRodada_id() {
		return rodada_id;
	}
	public void setRodada_id(int rodada_id) {
		this.rodada_id = rodada_id;
	}
	public int getClube_id() {
		return clube_id;
	}
	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
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
		return Integer.compare(atleta_id,that.atleta_id)==0;
	}
	
	@Override
	public int hashCode() {
		return slug.hashCode();
	}
    
}
