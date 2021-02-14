package br.com.nextevolution.gateway.httpClient.data.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LigasUserGatewayResponse {
    private List<LigaUserGatewayResponse> ligas;
}
