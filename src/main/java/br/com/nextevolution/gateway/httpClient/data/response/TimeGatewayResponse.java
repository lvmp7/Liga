package br.com.nextevolution.gateway.httpClient.data.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TimeGatewayResponse {
    private String nome;
    @JsonProperty("nome_cartola")
    private String nomeCartola;
    private String slug;
    private boolean assinante;
    @JsonProperty("time_id")
    private String id;
    @JsonProperty("url_escudo_png")
    private String urlEscudoPgn;
    @JsonProperty("url_escudo_svg")
    private String urlEscudoSvg;
    @JsonProperty("foto_perfil")
    private String urlFotoPerfil;
}
