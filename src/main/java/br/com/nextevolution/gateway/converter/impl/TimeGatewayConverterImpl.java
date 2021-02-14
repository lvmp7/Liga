package br.com.nextevolution.gateway.converter.impl;

import br.com.nextevolution.entity.Time;
import br.com.nextevolution.gateway.converter.TimeGatewayConverter;
import br.com.nextevolution.gateway.httpClient.data.response.TimeGatewayResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TimeGatewayConverterImpl implements TimeGatewayConverter {
    @Override
    public List<Time> convertToEntity(List<TimeGatewayResponse> timeGatewayResponse){
        return timeGatewayResponse.parallelStream().map(this::convertToEntity).collect(Collectors.toList());
    }

    public Time convertToEntity(TimeGatewayResponse timeGatewayResponse){
        return Time.builder()
                .id(timeGatewayResponse.getId())
                .assinante(timeGatewayResponse.isAssinante())
                .nome(timeGatewayResponse.getNome())
                .slug(timeGatewayResponse.getSlug())
                .urlEscudoPgn(timeGatewayResponse.getUrlEscudoPgn())
                .urlEscudoSvg(timeGatewayResponse.getUrlEscudoSvg())
                .urlFotoPerfil(timeGatewayResponse.getUrlFotoPerfil())
                .build();
    }
}
