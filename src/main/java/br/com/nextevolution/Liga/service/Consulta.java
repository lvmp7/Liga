package br.com.nextevolution.Liga.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

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
	public Mercado statusMercado(RestTemplate rest, String url) {
		System.out.println(rest.getForEntity(url, String.class));
		return null;
	}
	public Mercado statusMercado() {
		String url = "https://api.cartolafc.globo.com/mercado/status";
		Client client = ClientBuilder.newClient();		
		return client.target(url).request().get(Mercado.class);
	}
}
