package br.com.nextevolution.Liga.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
@Entity
public class Mercado {
	@Id
    private int rodada_atual;
    @JsonProperty("status_mercado")
    private int status;
    @JsonProperty("game_over")
    private boolean gameover;
    private int temporada;
    private boolean reativar;
    @JsonProperty("times_escalados")
    private int timesEscalados;
    @JsonProperty("timestamp")
    long fechamento;
    @JsonProperty("mercado_pos_rodada")
    private boolean posRodada;

    public int getRodada_atual() {
        return rodada_atual;
    }

    public void setRodada_atual(int rodada_atual) {
        this.rodada_atual = rodada_atual;
    }

    public int getStatus_mercado() {
        return status;
    }

    public void setStatus_mercado(int status) {
        this.status = status;
    }

    public boolean isGame_over() {
        return gameover;
    }

    public void setGame_over(boolean gameover) {
        this.gameover = gameover;
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public boolean isReativar() {
        return reativar;
    }

    public void setReativar(boolean reativar) {
        this.reativar = reativar;
    }

    public int getTimes_escalados() {
        return timesEscalados;
    }

    public void setTimes_escalados(int timesEscalados) {
        this.timesEscalados = timesEscalados;
    }
/*
    public Fechamento getFechamento() {
        return fechamento;
    }

    public void setFechamento(Fechamento fechamento) {
        this.fechamento = fechamento;
    }
  */
    public long getFechamento() {
        return fechamento;
    }

    public void setFechamento(long fechamento) {
        this.fechamento = fechamento;
    }
    

    public boolean isMercado_pos_rodada() {
        return posRodada;
    }

    public void setMercado_pos_rodada(boolean mercado_pos_rodada) {
        this.posRodada = mercado_pos_rodada;
    }
    
    @Override
    public boolean equals(Object obj) {
    	if (obj == this) return true;
    	if (! (obj instanceof Mercado) ) return false;
    	Mercado that = (Mercado) obj;
    	return Objects.equals(rodada_atual, that.rodada_atual);
    }
    
    @Override
    public int hashCode() {
    	return rodada_atual;
    }
}
