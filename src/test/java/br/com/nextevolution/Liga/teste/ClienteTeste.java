package br.com.nextevolution.Liga.teste;

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
    	CartolaAuthenticationService auth = new CartolaAuthenticationService();
        Token token = auth.getToken("lvmp7@hotmail.com","treyce2504");
        
    	ConsultaService consulta = new ConsultaService();
    	consulta.consultaLiga(token, "/auth/liga/masters-br");
    }
    @Test
    public void RetornaTime(){       
        CartolaAuthenticationService auth = new CartolaAuthenticationService();
        Token token = auth.getToken("lvmp7@hotmail.com","treyce2504");
        ConsultaService consulta = new ConsultaService();
    	consulta.consultaTime(token, "/auth/time");

    }
    @Test
    public void RetornaLigasDoUsuario() {
    	CartolaAuthenticationService auth = new CartolaAuthenticationService();
        Token token = auth.getToken("lvmp7@hotmail.com","treyce2504");
        ConsultaService consulta = new ConsultaService();
    	consulta.ligasDoUsuario(token, "/auth/ligas");
    }
    

}

