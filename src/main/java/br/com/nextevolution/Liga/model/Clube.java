package br.com.nextevolution.Liga.model;

public class Clube {
	private int id;
	private String nome;
	private String abreviacao;
	private int posicao;
	private Escudos escudos;
	private String nome_fantasia;
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
	public String getAbreviacao() {
		return abreviacao;
	}
	public void setAbreviacao(String abreviacao) {
		this.abreviacao = abreviacao;
	}
	public int getPosicao() {
		return posicao;
	}
	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}
	public Escudos getEscudos() {
		return escudos;
	}
	public void setEscudos(Escudos escudos) {
		this.escudos = escudos;
	}
	public String getNome_fantasia() {
		return nome_fantasia;
	}
	public void setNome_fantasia(String nome_fantasia) {
		this.nome_fantasia = nome_fantasia;
	}

}
