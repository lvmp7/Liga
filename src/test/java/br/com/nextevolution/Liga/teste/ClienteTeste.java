package br.com.nextevolution.Liga.teste;

import java.io.IOException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.service.CartolaAuthenticationService;
import br.com.nextevolution.Liga.service.Consulta;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ClienteTeste {
	
	
	
	
    @Test
    public void TesteStatusMercado() throws IOException {
        //Client client = ClientBuilder.newClient();
        //WebTarget target = client.target("https://api.cartolafc.globo.com");
        //target.path("/rodadas");
        //Rodada rodada = target.request().get(Rodada.class);
    	//RestTemplate restTemplate = new RestTemplate();
    	//Mercado mercado = new Consulta().statusMercado(restTemplate,"https://api.cartolafc.globo.com/mercado/status");
    	Mercado mercado = new Consulta().statusMercado();
    	
        Assert.assertTrue(mercado.getRodada_atual()==1);
    }

    @Test
    public void testeAutenticacao() {
        CartolaAuthenticationService auth = new CartolaAuthenticationService("lvmp7@hotmail.com","treyce2504");
        Token token = auth.getToken();
        System.out.println(token.getGlbId());
        Assert.assertTrue(token.getId().equals("Authenticated"));
    }

    @Test
    public void BuscaLiga(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthenticationService auth = new CartolaAuthenticationService("lvmp7@hotmail.com","treyce2504");

        target.path("/"+auth.getToken()+"/liga/masters-br");
        String response = target.request().get(String.class);

    }
    @Test
    public void RetornaTime(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthenticationService auth = new CartolaAuthenticationService("lvmp7@hotmail.com","treyce2504");

        target.path("/"+auth.getToken()+"/time");

        System.out.println(target);
        String response = target.request().get(String.class);
    }

}

