package br.com.nextevolution.gateway.converter;

import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.LigaUserGatewayResponse;

import java.util.List;

public interface CartolaGatewayConverter {
    List<Liga> convertToEntity(List<LigaGatewayResponse> ligas);
    List<Liga> convertLigaUserGatewayToEntity(List<LigaUserGatewayResponse> ligas);
}
