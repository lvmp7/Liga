package br.com.nextevolution.UseCase;

import br.com.nextevolution.entity.Liga;

import java.util.List;

public interface BuscarLigas {
    List<Liga> executar(String nome);
}
