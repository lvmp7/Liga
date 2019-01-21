package br.com.nextevolution.Liga.service;

import br.com.nextevolution.Liga.model.Rodada;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ConsultaRodada {
    private Rodada rodada;

    public Rodada consulta(){
        String target = "https://api.cartolafc.globo.com/rodadas";
        Client client = ClientBuilder.newClient();
        WebTarget webTarget = client.target(target);
        Invocation.Builder request = webTarget.request();
        Response response = request.get();
        this.rodada = response.readEntity(Rodada.class);

        return this.rodada;
    }
}
