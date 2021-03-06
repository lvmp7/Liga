package br.com.nextevolution.Liga.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonProperty;

@Embeddable
public class Escudos {
	
	@JsonProperty(value="60x60")
	private String t60x60;
	@JsonProperty(value="45x45")
	private String t45x45;
	@JsonProperty(value="30x30")
	private String t30x30;
	
	public String getT60x60() {
		return t60x60;
	}
	public void setT60x60(String t60x60) {
		this.t60x60 = t60x60;
	}
	public String getT45x45() {
		return t45x45;
	}
	public void setT45x45(String t45x45) {
		this.t45x45 = t45x45;
	}
	public String getT30x30() {
		return t30x30;
	}
	public void setT30x30(String t30x30) {
		this.t30x30 = t30x30;
	}
	
}
