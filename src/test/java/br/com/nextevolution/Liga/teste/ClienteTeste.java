package br.com.nextevolution.Liga.teste;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.model.Rodada;
import br.com.nextevolution.Liga.parser.Ligas;
import br.com.nextevolution.Liga.service.CartolaAuthenticationService;
import br.com.nextevolution.Liga.service.ConsultaService;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.RodadaService;

public class ClienteTeste {	
	
	
	/*
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
    	Ligas campeonatos = consulta.ligasDoUsuario(token, "/auth/ligas");
		List<Liga> ligas = campeonatos.getLigas();
    	
		System.out.println("Size: "+ ligas.size());
    	
    	for (Liga liga : ligas) {
			System.out.println(liga.getNome());
    		System.out.println(liga.getUrl_flamula_png());
		}
    }
    */
    @Test
    public void consultaRodada() {
    	RodadaService rodadaService = new RodadaService();
    	rodadaService.atualizaRodada();
    }
    @Test
    public void TesteStatusMercado(){
		MercadoService mercadoService = new MercadoService();
    	mercadoService.status();
    }
    

}

