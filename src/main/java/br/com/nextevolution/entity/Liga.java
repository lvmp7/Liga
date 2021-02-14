package br.com.nextevolution.entity;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
public class Liga {
    private String descricao;
    private String nome;
    private String slug;
    private String imagem;
    private LocalDateTime criada;

    private String id;
    private String timeDono;
    private boolean mataMata;
    private boolean semCapitao;
    private String urlFlamulaSvg;
    private String urlFlamulaPng;
    private String inicioNaRodada;
    private String fimNaRodada;
    private String quantidadeDeTimes;
    private boolean sorteada;
    private String totalDeTimesNaLiga;
    private String vagasRestantes;
}
