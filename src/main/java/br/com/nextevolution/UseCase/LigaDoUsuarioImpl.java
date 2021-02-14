package br.com.nextevolution.UseCase;

import br.com.nextevolution.entity.Liga;
import br.com.nextevolution.gateway.CartolaGateway;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

import static java.util.Objects.isNull;

@Component
@AllArgsConstructor
public class LigaDoUsuarioImpl implements LigaDoUsuario {

    private final CartolaGateway cartolaGateway;

    @Override
    public List<Liga> executar(String user) {
        return cartolaGateway.ligaDoUsuario(user);
    }
}
