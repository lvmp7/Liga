package br.com.nextevolution.Liga.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Mercado;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class ConsultaService {
	private Client client;
	private WebTarget target;
	
	@Autowired
	private CartolaAuthenticationService auth;
	
	public ConsultaService() {
		client = ClientBuilder.newClient();
		target = client.target("https://api.cartolafc.globo.com");
	}
	
	public Mercado consultaMercado(String targetpath) {
		return target.path(targetpath).request().get(Mercado.class);
	}
	
	public void consultaLiga(String targetpath) {
		System.out.println(target.path(targetpath).request().get(String.class));
		//return target.path(targetpath).request().get(Liga.class);
	}
	
	public void consultaLiga(Token token, String targetpath) {
		RestTemplate restTemplate = new RestTemplate();		
		restTemplate.getForEntity("https://api.cartolafc.globo.com/"+token.getGlbId()+"/"+targetpath, String.class);
		System.out.println(target.path(targetpath).request().get(String.class));
		//return target.path(targetpath).request().get(Liga.class);
	}
	
	
	
	/*
	public Mercado statusMercado() {
		String url = "https://api.cartolafc.globo.com/mercado/status";
		Client client = ClientBuilder.newClient();		
		return client.target(url).request().get(Mercado.class);
	}*/
}
