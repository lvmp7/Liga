package br.com.nextevolution.Liga.model;

import java.util.Date;

public class Convite {
	private long usuario;
	private Date data;
	private Cartola time;
	
	public long getUsuario() {
		return usuario;
	}
	public void setUsuario(long usuario) {
		this.usuario = usuario;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Cartola getTime() {
		return time;
	}
	public void setTime(Cartola time) {
		this.time = time;
	}
}
