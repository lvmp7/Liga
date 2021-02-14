package br.com.nextevolution.controller.conveter.impl;

import br.com.nextevolution.controller.data.response.LigaResponse;
import br.com.nextevolution.controller.conveter.LigaResponseConverter;
import br.com.nextevolution.entity.Liga;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class LigaResponseConverterImpl implements LigaResponseConverter {

    @Override
    public List<LigaResponse> convertToResponse(List<Liga> ligas) {
        return ligas.stream().map(this::convertToResponse).collect(Collectors.toList());
    }
    public LigaResponse convertToResponse(Liga ligas) {
        return LigaResponse.builder()
            .criada(ligas.getCriada())
            .descricao(ligas.getDescricao())
            .imagem(ligas.getImagem())
            .nome(ligas.getNome())
            .slug(ligas.getSlug())
            .build();
    }
}
