package br.com.nextevolution.Liga;

import br.com.nextevolution.Liga.autenticacao.CartolaAuthentication;
import br.com.nextevolution.Liga.model.Rodada;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import java.io.IOException;

public class ClienteTeste {

    @Test
    public void testeConexaoFunciona(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        target.path("/rodadas");
        String response = target.request().get(String.class);
        Assert.assertTrue(response.contains("rodada"));
    }

    @Test
    public void RetornaRodada() throws IOException {
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        target.path("/rodadas");
        Rodada rodada = target.request().get(Rodada.class);
        Assert.assertTrue(rodada.getRodada_atual()==38);
    }

    @Test
    public void testeAutenticacao() {
        CartolaAuthentication auth = new CartolaAuthentication("lvmp7@hotmail.com","treyce2504");
        System.out.println(auth.getToken());
    }

    @Test
    public void BuscaLiga(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthentication auth = new CartolaAuthentication("lvmp7@hotmail.com","treyce2504");

        target.path("/"+auth.getToken()+"/liga/masters-br");
        String response = target.request().get(String.class);

    }
    @Test
    public void RetornaTime(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthentication auth = new CartolaAuthentication("lvmp7@hotmail.com","treyce2504");

        target.path("/"+auth.getToken()+"/time");

        System.out.println(target);
        String response = target.request().get(String.class);
    }

}

