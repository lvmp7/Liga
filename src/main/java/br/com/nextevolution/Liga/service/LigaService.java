package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.autenticacao.Token;
import br.com.nextevolution.Liga.model.Liga;

@Service
public class LigaService extends Consulta{
	
	public Liga getLiga(Token token, String nomeLiga){
		Liga liga = null;
		try {
			return liga = consulta(token, "/auth/liga/"+nomeLiga).get(Liga.class);
		} catch (UnknownHostException e) {
			System.out.println("Não foi possivel encontrar a liga");
			e.printStackTrace();
		}
		return liga;
	}
		
	

}
