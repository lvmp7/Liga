package br.com.nextevolution.gateway.httpClient.data.response;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class BuscaLigaResponse {
    List<LigaGatewayResponse> ligas;
}
