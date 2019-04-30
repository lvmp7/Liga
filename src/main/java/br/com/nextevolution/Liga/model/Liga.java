package br.com.nextevolution.Liga.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Liga {
	private int liga_id;
	private int time_dono_id;
	private int clube_id;
    private String nome;
    private String descricao;
    private String slug;
    private String tipo;
    private boolean mata_mata;
    private boolean editorial;
    private boolean patrocinador;
    private String criacao;
    private int tipo_flamula;
    private int tipo_estampa_flamula;
    private int tipo_adorno_flamula;
    private String cor_primaria_estampa_flamula;
    private String cor_secundaria_estampa_flamula;
    private String cor_borda_flamula;
    private String cor_fundo_flamula;
    private String url_flamula_svg;
    private String url_flamula_png;
    private String tipo_trofeu;
    private String cor_trofeu;
    private String url_trofeu_svg;
    private String url_trofeu_png;
    private int inicio_rodada;
    private int fim_rodada;
    private int quantidade_times;
    private boolean sorteada;
    private String imagem;
    private String mes_ranking_num;
    private String mes_variacao_num;
    private String camp_ranking_num;
    private String camp_variacao_num;
    private String capitao_ranking_num;
    private String capitao_variacao_num;
    private String total_times_liga;
    private String vagas_restantes;
    private int total_amigos_na_liga;
    private List<Cartola> times;
    
	public int getLiga_id() {
		return liga_id;
	}
	public void setLiga_id(int liga_id) {
		this.liga_id = liga_id;
	}
	public int getTime_dono_id() {
		return time_dono_id;
	}
	public void setTime_dono_id(int time_dono_id) {
		this.time_dono_id = time_dono_id;
	}
	public int getClube_id() {
		return clube_id;
	}
	public void setClube_id(int clube_id) {
		this.clube_id = clube_id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getSlug() {
		return slug;
	}
	public void setSlug(String slug) {
		this.slug = slug;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public boolean isMata_mata() {
		return mata_mata;
	}
	public void setMata_mata(boolean mata_mata) {
		this.mata_mata = mata_mata;
	}
	public boolean isEditorial() {
		return editorial;
	}
	public void setEditorial(boolean editorial) {
		this.editorial = editorial;
	}
	public boolean isPatrocinador() {
		return patrocinador;
	}
	public void setPatrocinador(boolean patrocinador) {
		this.patrocinador = patrocinador;
	}
	public String getCriacao() {
		return criacao;
	}
	public void setCriacao(String criacao) {
		this.criacao = criacao;
	}
	public int getTipo_flamula() {
		return tipo_flamula;
	}
	public void setTipo_flamula(int tipo_flamula) {
		this.tipo_flamula = tipo_flamula;
	}
	public int getTipo_estampa_flamula() {
		return tipo_estampa_flamula;
	}
	public void setTipo_estampa_flamula(int tipo_estampa_flamula) {
		this.tipo_estampa_flamula = tipo_estampa_flamula;
	}
	public int getTipo_adorno_flamula() {
		return tipo_adorno_flamula;
	}
	public void setTipo_adorno_flamula(int tipo_adorno_flamula) {
		this.tipo_adorno_flamula = tipo_adorno_flamula;
	}
	public String getCor_primaria_estampa_flamula() {
		return cor_primaria_estampa_flamula;
	}
	public void setCor_primaria_estampa_flamula(String cor_primaria_estampa_flamula) {
		this.cor_primaria_estampa_flamula = cor_primaria_estampa_flamula;
	}
	public String getCor_secundaria_estampa_flamula() {
		return cor_secundaria_estampa_flamula;
	}
	public void setCor_secundaria_estampa_flamula(String cor_secundaria_estampa_flamula) {
		this.cor_secundaria_estampa_flamula = cor_secundaria_estampa_flamula;
	}
	public String getCor_borda_flamula() {
		return cor_borda_flamula;
	}
	public void setCor_borda_flamula(String cor_borda_flamula) {
		this.cor_borda_flamula = cor_borda_flamula;
	}
	public String getCor_fundo_flamula() {
		return cor_fundo_flamula;
	}
	public void setCor_fundo_flamula(String cor_fundo_flamula) {
		this.cor_fundo_flamula = cor_fundo_flamula;
	}
	public String getUrl_flamula_svg() {
		return url_flamula_svg;
	}
	public void setUrl_flamula_svg(String url_flamula_svg) {
		this.url_flamula_svg = url_flamula_svg;
	}
	public String getUrl_flamula_png() {
		return url_flamula_png;
	}
	public void setUrl_flamula_png(String url_flamula_png) {
		this.url_flamula_png = url_flamula_png;
	}
	public String getTipo_trofeu() {
		return tipo_trofeu;
	}
	public void setTipo_trofeu(String tipo_trofeu) {
		this.tipo_trofeu = tipo_trofeu;
	}
	public String getCor_trofeu() {
		return cor_trofeu;
	}
	public void setCor_trofeu(String cor_trofeu) {
		this.cor_trofeu = cor_trofeu;
	}
	public String getUrl_trofeu_svg() {
		return url_trofeu_svg;
	}
	public void setUrl_trofeu_svg(String url_trofeu_svg) {
		this.url_trofeu_svg = url_trofeu_svg;
	}
	public String getUrl_trofeu_png() {
		return url_trofeu_png;
	}
	public void setUrl_trofeu_png(String url_trofeu_png) {
		this.url_trofeu_png = url_trofeu_png;
	}
	public int getInicio_rodada() {
		return inicio_rodada;
	}
	public void setInicio_rodada(int inicio_rodada) {
		this.inicio_rodada = inicio_rodada;
	}
	public int getFim_rodada() {
		return fim_rodada;
	}
	public void setFim_rodada(int fim_rodada) {
		this.fim_rodada = fim_rodada;
	}
	public int getQuantidade_times() {
		return quantidade_times;
	}
	public void setQuantidade_times(int quantidade_times) {
		this.quantidade_times = quantidade_times;
	}
	public boolean isSorteada() {
		return sorteada;
	}
	public void setSorteada(boolean sorteada) {
		this.sorteada = sorteada;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getMes_ranking_num() {
		return mes_ranking_num;
	}
	public void setMes_ranking_num(String mes_ranking_num) {
		this.mes_ranking_num = mes_ranking_num;
	}
	public String getMes_variacao_num() {
		return mes_variacao_num;
	}
	public void setMes_variacao_num(String mes_variacao_num) {
		this.mes_variacao_num = mes_variacao_num;
	}
	public String getCamp_ranking_num() {
		return camp_ranking_num;
	}
	public void setCamp_ranking_num(String camp_ranking_num) {
		this.camp_ranking_num = camp_ranking_num;
	}
	public String getCamp_variacao_num() {
		return camp_variacao_num;
	}
	public void setCamp_variacao_num(String camp_variacao_num) {
		this.camp_variacao_num = camp_variacao_num;
	}
	public String getCapitao_ranking_num() {
		return capitao_ranking_num;
	}
	public void setCapitao_ranking_num(String capitao_ranking_num) {
		this.capitao_ranking_num = capitao_ranking_num;
	}
	public String getCapitao_variacao_num() {
		return capitao_variacao_num;
	}
	public void setCapitao_variacao_num(String capitao_variacao_num) {
		this.capitao_variacao_num = capitao_variacao_num;
	}
	public String getTotal_times_liga() {
		return total_times_liga;
	}
	public void setTotal_times_liga(String total_times_liga) {
		this.total_times_liga = total_times_liga;
	}
	public String getVagas_restantes() {
		return vagas_restantes;
	}
	public void setVagas_restantes(String vagas_restantes) {
		this.vagas_restantes = vagas_restantes;
	}
	public int getTotal_amigos_na_liga() {
		return total_amigos_na_liga;
	}
	public void setTotal_amigos_na_liga(int total_amigos_na_liga) {
		this.total_amigos_na_liga = total_amigos_na_liga;
	}
	public List<Cartola> getTimes() {
		return times;
	}
	public void setTimes(List<Cartola> times) {
		this.times = times;
	}
    
}
