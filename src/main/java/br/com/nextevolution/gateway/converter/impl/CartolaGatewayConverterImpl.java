package br.com.nextevolution.gateway.converter.impl;

import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.gateway.converter.CartolaGatewayConverter;
import br.com.nextevolution.gateway.httpClient.data.response.LigaGatewayResponse;
import br.com.nextevolution.gateway.httpClient.data.response.LigaUserGatewayResponse;
import br.com.nextevolution.utils.DateUtils;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CartolaGatewayConverterImpl implements CartolaGatewayConverter {
    @Override
    public List<Liga> convertToEntity(List<LigaGatewayResponse> ligas) {
        return ligas.stream().map(this::convetToEntity).collect(Collectors.toList());
    }

    public Liga convetToEntity(LigaGatewayResponse ligaResponse) {
        return Liga.builder()
            .criada(DateUtils.convertoToLocalDateTime(ligaResponse.getCriacao()))
            .descricao(ligaResponse.getDescricao())
            .imagem(ligaResponse.getImagem())
            .nome(ligaResponse.getNome())
            .slug(ligaResponse.getSlug())
            .build();
    }

    @Override
    public List<Liga> convertLigaUserGatewayToEntity(List<LigaUserGatewayResponse> ligas) {
        return ligas.parallelStream().map(this::convertToEntity).collect(Collectors.toList());
    }

    private Liga convertToEntity(LigaUserGatewayResponse liga) {
        return Liga.builder()
            .criada(LocalDateTime.parse(liga.getCriacao(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")))
            .nome(liga.getNome())
            .descricao(liga.getDescricao())
            .imagem(liga.getImagem())
            .slug(liga.getSlug())
            .id(liga.getLigaId())
            .inicioNaRodada(liga.getInicioNaRodada())
            .fimNaRodada(liga.getFimNaRodada())
            .mataMata(liga.isMataMata())
            .quantidadeDeTimes(liga.getQuantidadeDeTimes())
            .semCapitao(liga.isSemCapitao())
            .sorteada(liga.isSorteada())
            .timeDono(liga.getTimeDono())
            .totalDeTimesNaLiga(liga.getTotalDeTimesNaLiga())
            .urlFlamulaPng(liga.getUrlFlamulaPng())
            .urlFlamulaSvg(liga.getUrlFlamulaSvg())
            .vagasRestantes(liga.getVagasRestantes())
            .build();
    }
}
