package br.com.nextevolution.Liga.model;

public class AtletaRodada {
	
	private String apelido;
	private Double pontuacao;
	private Scout scout;
	private String foto;
	private int posicao_id;
	private int clube_id;
	
	public String getApelido() {
		return apelido;
	}
	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	public Double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}
	public Scout getScout() {
		return scout;
	}
	public void setScout(Scout scout) {
		this.scout = scout;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public int getPosicao_id() {
		return posicao_id;
	}
	public void setPosicao_id(int posicao_id) {
		this.posicao_id = posicao_id;
	}
	public int getClube_id() {
		return clube_id;
	}
	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
	}
}
