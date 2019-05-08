package br.com.nextevolution.Liga.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class Pontuacao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rodada;
	@OneToOne(cascade=CascadeType.PERSIST)
	private Time time;
	@OneToOne
	private Cartoleiro cartoleiro;
	
	public Pontuacao() {
	}

	public Pontuacao(int rodada, Time cartola, Cartoleiro cartoleiro) {
		super();
		this.rodada = rodada;
		this.time = cartola;
		this.cartoleiro = cartoleiro;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public Time getCartola() {
		return time;
	}

	public void setCartola(Time cartola) {
		this.time = cartola;
	}
	
	public Cartoleiro getCartoleiro() {
		return cartoleiro;
	}
	
	public void setCartoleiro(Cartoleiro cartoleiro) {
		this.cartoleiro = cartoleiro;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (!(obj instanceof Pontuacao)) return false;
        Pontuacao that = (Pontuacao) obj;
        return Objects.equals(rodada, that.rodada) &&
                Objects.equals(time, that.time ) &&
                Objects.equals(cartoleiro, that.cartoleiro);
	}
	@Override
	public int hashCode() {
		return Objects.hash(rodada,time.getRodada_atual());
	}
	
}
