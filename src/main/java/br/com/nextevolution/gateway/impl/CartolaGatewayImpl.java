package br.com.nextevolution.gateway.impl;

import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.entity.Time;
import br.com.nextevolution.exception.CartolaException;
import br.com.nextevolution.gateway.CartolaGateway;
import br.com.nextevolution.gateway.converter.CartolaGatewayConverter;
import br.com.nextevolution.gateway.converter.TimeGatewayConverter;
import br.com.nextevolution.gateway.httpClient.CartolaClient;
import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import feign.FeignException;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@AllArgsConstructor
@Log
public class CartolaGatewayImpl implements CartolaGateway {
    private final CartolaClient cartolaClient;
    private final CartolaGatewayConverter cartolaGatewayConverter;
    private final TimeGatewayConverter timeGatewayConverter;

    @Override
    public List<Liga> consultarLigas(String nomeDaLiga) {
        try {
            List<LigaGatewayResponse> ligaGatewayRespons = cartolaClient.buscarLigas(nomeDaLiga);
            return cartolaGatewayConverter.convertToEntity(ligaGatewayRespons);
        }catch (FeignException e){
            log.severe(e.contentUTF8());
            throw new CartolaException();
        }
    }

    @Override
    public List<Liga> ligaDoUsuario(String user) {
        return cartolaGatewayConverter.convertLigaUserGatewayToEntity(cartolaClient.minhaLiga(user));
    }

    @Override
    public Time buscaTime(String nome) {
        List<Time> times = timeGatewayConverter.convertToEntity(cartolaClient.buscarTime(nome));
        Optional<Time> time = times.stream().findFirst().filter(t -> t.getNome().equals(nome) || t.getSlug().equals(nome));
        return time.orElse(null);
    }
}