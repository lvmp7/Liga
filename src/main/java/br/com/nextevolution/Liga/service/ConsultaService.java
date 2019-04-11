package br.com.nextevolution.Liga.service;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.parser.Ligas;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class ConsultaService {
	private Client client;
	private WebTarget target;
	private List ligas;
	
	public ConsultaService() {
		client = ClientBuilder.newClient();
		target = client.target("https://api.cartolafc.globo.com");
	}
	
	public Mercado consultaMercado(String targetpath) {
		return target.path(targetpath).request().get(Mercado.class);
	}
	
	public void consultaLiga(Token token, String targetpath) {
		System.out.println(target.path(targetpath).request().header("X-GLB-Token", token.getGlbId()).get(String.class) );
		//return target.path(targetpath).request().get(Liga.class);
	}
	
	public void consultaTime(Token token, String targetpath) {
		System.out.println(target.path(targetpath).request().header("X-GLB-Token", token.getGlbId()).get(String.class) );
	}
	
	public Ligas ligasDoUsuario(Token token, String targetpath) {
		return target.path(targetpath).request().header("X-GLB-Token", token.getGlbId()).get(Ligas.class);
	}
	
	
	
	/*
	public Mercado statusMercado() {
		String url = "https://api.cartolafc.globo.com/mercado/status";
		Client client = ClientBuilder.newClient();		
		return client.target(url).request().get(Mercado.class);
	}*/
}
