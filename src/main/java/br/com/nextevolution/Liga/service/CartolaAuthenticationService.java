package br.com.nextevolution.Liga.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.autenticacao.Autenticacao;
import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.GloboPayload;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class CartolaAuthenticationService {
    private Token token;

    public Token getToken(String email,String password) {
    	GloboPayload payload = new GloboPayload(email,password,438);
        Autenticacao auth = new Autenticacao(payload);
    	RestTemplate client = new RestTemplate();
    	this.token = client.postForObject("https://login.globo.com/api/authentication", auth, Token.class);
        return token;
    }
    
    public Token getToken() {
    	String email = "lvmp7@hotmail.com";
    	String password = "treyce2504";
    	GloboPayload payload = new GloboPayload(email,password,438);
        Autenticacao auth = new Autenticacao(payload);
    	RestTemplate client = new RestTemplate();
    	this.token = client.postForObject("https://login.globo.com/api/authentication", auth, Token.class);
        return token;
    }
}
