package br.com.nextevolution.Liga.model;

import java.util.Calendar;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Rodada {
	@Id
	@JsonProperty("rodada_id")
	private int id;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Calendar inicio;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
	private Calendar fim;
	
	public Rodada() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getInicio() {
		return inicio;
	}
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}
	public Calendar getFim() {
		return fim;
	}
	public void setFim(Calendar fim) {
		this.fim = fim;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj == this) return true;
    	if (! (obj instanceof Rodada) ) return false;
    	Rodada that = (Rodada) obj;
    	return Objects.equals(id, that.id);
    }
	
	@Override
	public int hashCode() {
		return id;
	}
}
