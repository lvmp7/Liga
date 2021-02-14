package br.com.nextevolution.gateway.converter;

import br.com.nextevolution.entity.Time;
import br.com.nextevolution.gateway.httpClient.data.response.TimeGatewayResponse;

import java.util.List;

public interface TimeGatewayConverter {
    List<Time> convertToEntity(List<TimeGatewayResponse> timeGatewayResponse);
}
