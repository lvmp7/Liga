package br.com.nextevolution.Liga.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
<<<<<<< HEAD
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
=======

import org.springframework.web.client.RestTemplate;

import br.com.nextevolution.Liga.model.Mercado;

public class Consulta {
    
	public Mercado statusMercado(RestTemplate rest, String url) {
		System.out.println(rest.getForEntity(url, String.class));
		return null;
	}
	
	public Mercado statusMercado() {
		String url = "https://api.cartolafc.globo.com/mercado/status";
		Client client = ClientBuilder.newClient();		
		return client.target(url).request().get(Mercado.class);
	}

    
>>>>>>> 1a319b7c4244af9b029ad6df4790c88854fe84c1
}
