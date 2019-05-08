package br.com.nextevolution.Liga.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@Embeddable
public class Scout {
	@JsonProperty("sg")
	private int saldoGol;
	@JsonProperty("dp")
	private int defesaPenalti;
	@JsonProperty("dd")
	private int defesaDificil;
	@JsonProperty("rb")
	private int roubadaBola;
	@JsonProperty("gc")
	private int golContra;
	@JsonProperty("cv")
	private int cartaoVermelho;
	@JsonProperty("ca")
	private int cartaoAmarelo;
	@JsonProperty("gs")
	private int golSofrido;
	@JsonProperty("fc")
	private int faltaCometida;
	@JsonProperty("g")
	private int gol;
	@JsonProperty("a")
	private int assistencia;
	@JsonProperty("ft")
	private int finalizacaoTrave;
	@JsonProperty("fd")
	private int finalizacaoDefendida;
	@JsonProperty("ff")
	private int finalizacaoFora;
	@JsonProperty("fs")
	private int faltaSofrida;
	@JsonProperty("pp")
	private int penaltiPerdido;
	@JsonProperty("i")
	private int impedimento;
	@JsonProperty("pe")
	private int passeErrado;
	public int getSaldoGol() {
		return saldoGol;
	}
	public void setSaldoGol(int saldoGol) {
		this.saldoGol = saldoGol;
	}
	public int getDefesaPenalti() {
		return defesaPenalti;
	}
	public void setDefesaPenalti(int defesaPenalti) {
		this.defesaPenalti = defesaPenalti;
	}
	public int getDefesaDificil() {
		return defesaDificil;
	}
	public void setDefesaDificil(int defesaDificil) {
		this.defesaDificil = defesaDificil;
	}
	public int getRoubadaBola() {
		return roubadaBola;
	}
	public void setRoubadaBola(int roubadaBola) {
		this.roubadaBola = roubadaBola;
	}
	public int getGolContra() {
		return golContra;
	}
	public void setGolContra(int golContra) {
		this.golContra = golContra;
	}
	public int getCartaoVermelho() {
		return cartaoVermelho;
	}
	public void setCartaoVermelho(int cartaoVermelho) {
		this.cartaoVermelho = cartaoVermelho;
	}
	public int getCartaoAmarelo() {
		return cartaoAmarelo;
	}
	public void setCartaoAmarelo(int cartaoAmarelo) {
		this.cartaoAmarelo = cartaoAmarelo;
	}
	public int getGolSofrido() {
		return golSofrido;
	}
	public void setGolSofrido(int golSofrido) {
		this.golSofrido = golSofrido;
	}
	public int getFaltaCometida() {
		return faltaCometida;
	}
	public void setFaltaCometida(int faltaCometida) {
		this.faltaCometida = faltaCometida;
	}
	public int getGol() {
		return gol;
	}
	public void setGol(int gol) {
		this.gol = gol;
	}
	public int getAssistencia() {
		return assistencia;
	}
	public void setAssistencia(int assistencia) {
		this.assistencia = assistencia;
	}
	public int getFinalizacaoTrave() {
		return finalizacaoTrave;
	}
	public void setFinalizacaoTrave(int finalizacaoTrave) {
		this.finalizacaoTrave = finalizacaoTrave;
	}
	public int getFinalizacaoDefendida() {
		return finalizacaoDefendida;
	}
	public void setFinalizacaoDefendida(int finalizacaoDefendida) {
		this.finalizacaoDefendida = finalizacaoDefendida;
	}
	public int getFinalizacaoFora() {
		return finalizacaoFora;
	}
	public void setFinalizacaoFora(int finalizacaoFora) {
		this.finalizacaoFora = finalizacaoFora;
	}
	public int getFaltaSofrida() {
		return faltaSofrida;
	}
	public void setFaltaSofrida(int faltaSofrida) {
		this.faltaSofrida = faltaSofrida;
	}
	public int getPenaltiPerdido() {
		return penaltiPerdido;
	}
	public void setPenaltiPerdido(int penaltiPerdido) {
		this.penaltiPerdido = penaltiPerdido;
	}
	public int getImpedimento() {
		return impedimento;
	}
	public void setImpedimento(int impedimento) {
		this.impedimento = impedimento;
	}
	public int getPasseErrado() {
		return passeErrado;
	}
	public void setPasseErrado(int passeErrado) {
		this.passeErrado = passeErrado;
	}
	
		
//	@Override
//	public boolean equals(Object obj) {
//		if(this == obj) return true;
//		if(!(obj instanceof Scout))return false;
//		Scout that = (Scout) obj;
//		return Integer.compare(id, that.id)==0;
//	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
}
