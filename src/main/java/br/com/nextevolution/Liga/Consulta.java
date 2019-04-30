package br.com.nextevolution.Liga;

import java.net.UnknownHostException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;

import br.com.nextevolution.Liga.autenticacao.Token;

public class Consulta {
	private Client client;
	private WebTarget target;
	
	public Consulta() {
		client = ClientBuilder.newClient();
		target = client.target("https://api.cartolafc.globo.com");
	}
	
	public Builder consulta(String targetpath) throws UnknownHostException {
		return target.path(targetpath).request();

	}
	
	public Builder consulta(Token token, String targetpath) throws UnknownHostException {
		System.out.println("Token: "+token.getGlbId());
		return target.path(targetpath).request().header("X-GLB-Token", token.getGlbId());
	}

}
