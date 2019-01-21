package br.com.nextevolution.Liga.autenticacao;

import br.com.nextevolution.Liga.model.GloboPayload;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class Autenticacao {
    private GloboPayload payload;

    public Autenticacao(GloboPayload payload) {
        this.payload = payload;
    }

    public GloboPayload getPayload() {
        return payload;
    }

    public void setPayload(GloboPayload payload) {
        this.payload = payload;
    }
}
