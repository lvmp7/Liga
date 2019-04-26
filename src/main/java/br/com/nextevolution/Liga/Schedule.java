package br.com.nextevolution.Liga;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.service.MercadoService;


public class Schedule {
	@Autowired
	private MercadoService mercadoService;
	private Client client;
	private WebTarget target;
	
	public Schedule() {
		client = ClientBuilder.newClient();
		target = client.target("https://api.cartolafc.globo.com");
	}
	
	public void consultaMercado(String targetpath) {
		mercadoService.save( target.path(targetpath).request().get(Mercado.class) );
	}
}
