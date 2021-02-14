package br.com.nextevolution.gateway.httpClient;

import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.LigaUserGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.TimeGatewayResponse;

import java.util.List;

public interface CartolaClient {

    List<LigaGatewayResponse> buscarLigas(String nome);
    List<LigaUserGatewayResponse> minhaLiga(String user);
    List<TimeGatewayResponse> buscarTime(String nome);
}
