package br.com.nextevolution.Liga;

import java.net.UnknownHostException;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation.Builder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Rodada;

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
	
	public Response consulta(Token token, String targetpath, Class<?> clazz) throws UnknownHostException {
		return target.path(targetpath).request().header("X-GLB-Token", token.getGlbId()).get();
	}

}
