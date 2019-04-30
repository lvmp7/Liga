package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.LigaRepository;
import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Liga;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class LigaService extends Consulta{
	
	@Autowired
	private LigaRepository ligaRepository;
	@Autowired
	private CartolaAuthenticationService auth;
	
	public Liga getLiga(Token token, String nomeLiga){
		return ligaRepository.findAll().get(0);
	}
	
	public void atualiza() {
		try {
			Liga liga = consulta(auth.getToken(), "/auth/liga/masters-br").get(Liga.class);
			ligaRepository.save(liga);
		} catch (UnknownHostException e) {
			System.out.println("falha na consulta");
			e.printStackTrace();
		}
	}
	

}
