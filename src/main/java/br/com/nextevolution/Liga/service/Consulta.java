package br.com.nextevolution.Liga.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.web.client.RestTemplate;

import br.com.nextevolution.Liga.model.Mercado;

public class Consulta {
	private Client client;
	private WebTarget target;
	
	public Consulta() {
		client = ClientBuilder.newClient();
		target = client.target("https://api.cartolafc.globo.com");
	}
	
	public Mercado consultaMercado(RestTemplate rest, String url) {
    	return rest.getForObject(url, Mercado.class);
    }

	public String consultaMercado(String targetpath) {
		return target.path(targetpath).request().get(String.class);
	}
}
