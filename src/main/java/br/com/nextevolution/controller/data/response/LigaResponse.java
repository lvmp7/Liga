package br.com.nextevolution.controller.data.response;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class LigaResponse {
    private String descricao;
    private String nome;
    private String slug;
    private String imagem;
    private LocalDateTime criada;
}
