package br.com.nextevolution.gateway.httpClient.impl;

import br.com.nextevolution.controller.data.request.AuthenticationRequest;
import br.com.nextevolution.controller.data.request.PayloadRequest;
import br.com.nextevolution.gateway.httpClient.GloboClient;
import br.com.nextevolution.gateway.httpClient.data.response.TokenResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@AllArgsConstructor
public class GloboClientImpl implements GloboClient {
    private final RestTemplate restTemplate;

    @Override
    public TokenResponse authenticar(String user, String pass) {
        PayloadRequest payload = PayloadRequest.builder()
                .email(user)
                .password(pass)
                .serviceId(438)
                .build();

        AuthenticationRequest auth = AuthenticationRequest.builder()
                .payload(payload)
                .build();

        return restTemplate.postForObject("https://login.globo.com/api/authentication", auth, TokenResponse.class);
    }
}
