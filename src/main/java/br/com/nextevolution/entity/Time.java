package br.com.nextevolution.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Time {
    private String patrimonio;
    private String nome;
    private String slug;
    private boolean assinante;
    private String id;
    private String urlEscudoPgn;
    private String urlEscudoSvg;
    private String urlFotoPerfil;
}
