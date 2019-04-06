package br.com.nextevolution.Liga.autenticacao;

import br.com.nextevolution.Liga.model.GloboPayload;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class CartolaAuthentication {
    private String token;

    public CartolaAuthentication(String email,String password) {

        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://login.globo.com/api/authentication");
        GloboPayload payload = new GloboPayload(email,password,438);
        Autenticacao auth = new Autenticacao(payload);

        Entity entity = Entity.json(auth);

        Response response = target.request().header("Content-type", "application/json")
                .accept("Accept","text/plain").post(entity);
        Token token = response.readEntity(Token.class);
        //System.out.println(response.readEntity(String.class));
        this.token = token.getGlbId();
    }

    public String getToken() {
        System.out.println(token);
        return token;
    }
}
