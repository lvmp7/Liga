package br.com.nextevolution.UseCase.impl;

import br.com.nextevolution.UseCase.BuscarLigas;
import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.gateway.CartolaGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class BuscarLigasImpl implements BuscarLigas {
    private CartolaGateway cartolaGateway;

    @Override
    public List<Liga> executar(String nome) {
        return cartolaGateway.consultarLigas(nome);
    }
}
