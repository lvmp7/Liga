package br.com.nextevolution.gateway.httpClient;

import br.com.nextevolution.gateway.httpClient.data.response.TokenResponse;

public interface GloboClient {
    TokenResponse authenticar(String user, String pass);
}
