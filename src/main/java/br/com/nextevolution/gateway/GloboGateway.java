package br.com.nextevolution.gateway;

import br.com.nextevolution.entity.Cartoleiro;

public interface GloboGateway {
    Cartoleiro autenticar(String user, String pass);
}
