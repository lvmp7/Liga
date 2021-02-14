package br.com.nextevolution.gateway;

import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.entity.Time;

import java.util.List;

public interface CartolaGateway {
    List<Liga> consultarLigas(String nomeDaLiga);
    List<Liga> ligaDoUsuario(String user);
    Time buscaTime(String nome);
}
