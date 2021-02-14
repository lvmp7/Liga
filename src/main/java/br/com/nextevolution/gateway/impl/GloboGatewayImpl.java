package br.com.nextevolution.gateway.impl;

import br.com.nextevolution.entity.Cartoleiro;
import br.com.nextevolution.gateway.GloboGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class GloboGatewayImpl implements GloboGateway {

    @Override
    public Cartoleiro autenticar(String user, String pass) {
        return null;
    }
}
