package br.com.nextevolution.Liga.autenticacao;

import br.com.nextevolution.Liga.model.GloboPayload;

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
