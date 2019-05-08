package br.com.nextevolution.Liga.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LigaCartola {
	
	private Liga liga;
	private List<Cartoleiro> times;
	
	public LigaCartola() {
	}
	
	public LigaCartola(Liga liga, List<Cartoleiro> times) {
		this.liga = liga;
		this.times = times;
	}

	public Liga getLiga() {
		return liga;
	}

	public void setLiga(Liga liga) {
		this.liga = liga;
	}

	public List<Cartoleiro> getTimes() {
		return times;
	}

	public void setTimes(List<Cartoleiro> times) {
		this.times = times;
	}

}
