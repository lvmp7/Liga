package br.com.nextevolution.Liga.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.nextevolution.Liga.autenticacao.Autenticacao;
import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.GloboPayload;

@Service
public class CartolaAuthenticationService {
    private Token token;

    public Token getToken(String email,String password) {
    	
    	System.out.println(" Executando auth");
    	GloboPayload payload = new GloboPayload(email,password,438);
        Autenticacao auth = new Autenticacao(payload);
    	RestTemplate client = new RestTemplate();
    	this.token = client.postForObject("https://login.globo.com/api/authentication", auth, Token.class);
    	
    	System.out.println(" Token auth:"+ token.getGlbId());
    	
    	System.out.println(" Fim auth");
    	
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
