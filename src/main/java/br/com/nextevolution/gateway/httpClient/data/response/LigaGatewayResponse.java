package br.com.nextevolution.gateway.httpClient.data.response;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class LigaGatewayResponse {
    private String descricao;
    private String nome;
    private String slug;
    private String imagem;
    private String criacao;
}
