package br.com.nextevolution.gateway.httpClient.data.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class LigaUserGatewayResponse {
    @JsonProperty("liga_id")
    private String ligaId;
    @JsonProperty("time_dono_id")
    private String timeDono;
    private String nome;
    private String descricao;
    private String slug;
    @JsonProperty("mata_mata")
    private boolean mataMata;
    private String criacao;
    @JsonProperty("sem_capitao")
    private boolean semCapitao;
    @JsonProperty("url_flamula_svg")
    private String urlFlamulaSvg;
    @JsonProperty("url_flamula_png")
    private String urlFlamulaPng;
    @JsonProperty("inicio_rodada")
    private String inicioNaRodada;
    @JsonProperty("fim_rodada")
    private String fimNaRodada;
    @JsonProperty("quantidade_times")
    private String quantidadeDeTimes;
    private boolean sorteada;
    private String imagem;
    @JsonProperty("total_times_liga")
    private String totalDeTimesNaLiga;
    @JsonProperty("vagas_restantes")
    private String vagasRestantes;
}
