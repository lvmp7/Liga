package br.com.nextevolution.Liga.teste;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.junit.Assert;
import org.junit.Test;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.service.CartolaAuthenticationService;
import br.com.nextevolution.Liga.service.ConsultaService;


public class ClienteTeste {	
	
	@Test
    public void TesteStatusMercado(){
		ConsultaService consulta = new ConsultaService();
    	//Mercado mercado = consulta.statusMercado();
    	Mercado mercado = consulta.consultaMercado("/mercado/status");
        Assert.assertTrue(mercado.getRodada_atual()==1);
    }

    @Test
    public void testeAutenticacao() {
        CartolaAuthenticationService auth = new CartolaAuthenticationService();
        Token token = auth.getToken("lvmp7@hotmail.com","treyce2504");
        System.out.println(token.getGlbId());
        Assert.assertTrue(token.getId().equals("Authenticated"));
    }

    @Test
    public void BuscaLiga(){
    	Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthenticationService auth = new CartolaAuthenticationService();
        Token token = auth.getToken("lvmp7@hotmail.com","treyce2504");
        System.out.println(token.getId());
        System.out.println(token.getGlbId());
        System.out.println(token.getUserMessage());
        target.path("/liga/masters-br");
        String response = target.request().get(String.class);
        System.out.println(response);
        
    }
    @Test
    public void RetornaTime(){
        Client client = ClientBuilder.newClient();
        WebTarget target = client.target("https://api.cartolafc.globo.com");
        CartolaAuthenticationService auth = new CartolaAuthenticationService();
        target.path("/"+auth.getToken("lvmp7@hotmail.com","treyce2504").getGlbId()+"/time");

        System.out.println(target);
        String response = target.request().get(String.class);
    }

}

