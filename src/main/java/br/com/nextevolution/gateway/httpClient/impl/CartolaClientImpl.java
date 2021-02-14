package br.com.nextevolution.gateway.httpClient.impl;

import br.com.nextevolution.gateway.httpClient.CartolaClient;
import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.LigaUserGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.LigasUserGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.TimeGatewayResponse;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import javax.ws.rs.client.WebTarget;
import java.util.List;
import java.util.stream.Collectors;

@Component
@AllArgsConstructor
public class CartolaClientImpl implements CartolaClient {
    private final WebTarget webTarget;
    private final ObjectMapper mapper;

    @Override
    public List<LigaGatewayResponse> buscarLigas(String nome) {
        List responseList = webTarget.path("/ligas").queryParam("q", nome).request().get(List.class);
        return (List<LigaGatewayResponse>) responseList.stream().map(this::convertToLigaGatewayResponse).collect(Collectors.toList());
    }

    private LigaGatewayResponse convertToLigaGatewayResponse(Object o){
        return mapper.convertValue(o, LigaGatewayResponse.class);
    }

    @Override
    public List<LigaUserGatewayResponse> minhaLiga(String user) {
        LigasUserGatewayResponse ligasUserGatewayResponse = webTarget.path("/auth/ligas").request().header("X-GLB-Token", user).get(LigasUserGatewayResponse.class);
//        String s = webTarget.path("/auth/ligas").request().header("X-GLB-Token", user).get(String.class);
//        return (List<LigaUserGatewayResponse>) ligas.parallelStream().map(this::convertToLigaUserGatewayResponse).collect(Collectors.toList());
        return ligasUserGatewayResponse.getLigas();
//        return null;
    }


    private LigaUserGatewayResponse convertToLigaUserGatewayResponse(Object o){
        return mapper.convertValue(o, LigaUserGatewayResponse.class);
    }

    @Override
    public List<TimeGatewayResponse> buscarTime(String nome) {
        List listaDeTimes = webTarget.path("/times").queryParam("q", nome).request().get(List.class);
        return (List<TimeGatewayResponse>) listaDeTimes.stream().map(this::convertToTimeGatewayResponse).collect(Collectors.toList());
    }

    private TimeGatewayResponse convertToTimeGatewayResponse(Object o){
        return mapper.convertValue(o, TimeGatewayResponse.class);
    }
}
