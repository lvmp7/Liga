package br.com.nextevolution.Liga.service.dto;

public class TimeRodadaDTO {

    private String time;
    private String cartola;
    private int rodada;
    private double pontos;
    private int gols;
    private int assistencias;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getCartola() {
        return cartola;
    }

    public void setCartola(String cartola) {
        this.cartola = cartola;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public double getPontos() {
        return pontos;
    }

    public void setPontos(double pontos) {
        this.pontos = pontos;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getAssistencias() {
        return assistencias;
    }

    public void setAssistencias(int assistencias) {
        this.assistencias = assistencias;
    }
}
