package br.com.nextevolution.Liga.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Mercado {
    private int rodada_atual;
    @JsonProperty("status_mercado")
    private int statusmercado;
    private int esquema_default_id;
    private int cartoleta_inicial;
    private int max_ligas_free;
    private int max_ligas_pro;
    private int max_ligas_matamata_free;
    private int max_ligas_matamata_pro;
    private int max_ligas_patrocinadas_free;
    private int max_ligas_patrocinadas_pro_num;
    private boolean game_over;
    private int temporada;
    private boolean reativar;
    private boolean exibe_sorteio_pro;
    private int times_escalados;
    Fechamento fechamento;
    private boolean mercado_pos_rodada;
//    private String aviso;
//    private String aviso_url;
    //@XmlAttribute(name="limites_competicao")
    
    @JsonProperty("limites_competicao")
    private LimitesCompeticao limitesCompeticao;

    public int getRodada_atual() {
        return rodada_atual;
    }

    public void setRodada_atual(int rodada_atual) {
        this.rodada_atual = rodada_atual;
    }

    public int getStatus_mercado() {
        return statusmercado;
    }

    public void setStatus_mercado(int statusmercado) {
        this.statusmercado = statusmercado;
    }

    public int getEsquema_default_id() {
        return esquema_default_id;
    }

    public void setEsquema_default_id(int esquema_default_id) {
        this.esquema_default_id = esquema_default_id;
    }

    public int getCartoleta_inicial() {
        return cartoleta_inicial;
    }

    public void setCartoleta_inicial(int cartoleta_inicial) {
        this.cartoleta_inicial = cartoleta_inicial;
    }

    public int getMax_ligas_free() {
        return max_ligas_free;
    }

    public void setMax_ligas_free(int max_ligas_free) {
        this.max_ligas_free = max_ligas_free;
    }

    public int getMax_ligas_pro() {
        return max_ligas_pro;
    }

    public void setMax_ligas_pro(int max_ligas_pro) {
        this.max_ligas_pro = max_ligas_pro;
    }

    public int getMax_ligas_matamata_free() {
        return max_ligas_matamata_free;
    }

    public void setMax_ligas_matamata_free(int max_ligas_matamata_free) {
        this.max_ligas_matamata_free = max_ligas_matamata_free;
    }

    public int getMax_ligas_matamata_pro() {
        return max_ligas_matamata_pro;
    }

    public void setMax_ligas_matamata_pro(int max_ligas_matamata_pro) {
        this.max_ligas_matamata_pro = max_ligas_matamata_pro;
    }

    public int getMax_ligas_patrocinadas_free() {
        return max_ligas_patrocinadas_free;
    }

    public void setMax_ligas_patrocinadas_free(int max_ligas_patrocinadas_free) {
        this.max_ligas_patrocinadas_free = max_ligas_patrocinadas_free;
    }

    public int getMax_ligas_patrocinadas_pro_num() {
        return max_ligas_patrocinadas_pro_num;
    }

    public void setMax_ligas_patrocinadas_pro_num(int max_ligas_patrocinadas_pro_num) {
        this.max_ligas_patrocinadas_pro_num = max_ligas_patrocinadas_pro_num;
    }

    public boolean isGame_over() {
        return game_over;
    }

    public void setGame_over(boolean game_over) {
        this.game_over = game_over;
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

    public boolean isExibe_sorteio_pro() {
        return exibe_sorteio_pro;
    }

    public void setExibe_sorteio_pro(boolean exibe_sorteio_pro) {
        this.exibe_sorteio_pro = exibe_sorteio_pro;
    }

    public int getTimes_escalados() {
        return times_escalados;
    }

    public void setTimes_escalados(int times_escalados) {
        this.times_escalados = times_escalados;
    }

    public Fechamento getFechamento() {
        return fechamento;
    }

    public void setFechamento(Fechamento fechamento) {
        this.fechamento = fechamento;
    }

    public boolean isMercado_pos_rodada() {
        return mercado_pos_rodada;
    }

    public void setMercado_pos_rodada(boolean mercado_pos_rodada) {
        this.mercado_pos_rodada = mercado_pos_rodada;
    }
/*
    public String getAviso() {
        return aviso;
    }

    public void setAviso(String aviso) {
        this.aviso = aviso;
    }

    public String getAviso_url() {
        return aviso_url;
    }

    public void setAviso_url(String aviso_url) {
        this.aviso_url = aviso_url;
    }
*/
	public LimitesCompeticao getLimitesCompeticao() {
		return limitesCompeticao;
	}

	public void setLimites_Competicao(LimitesCompeticao limitescompeticao) {
		this.limitesCompeticao = limitescompeticao;
	}
}
