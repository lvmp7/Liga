package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.LigaRepository;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.LigaCartola;

@Service
public class LigaService extends Consulta{
	
	@Autowired private LigaRepository ligaRepository;
	@Autowired private CartolaAuthenticationService auth;
	@Autowired private CartoleiroService cartoleiroService;
		
	public Liga getLiga() {
		return	ligaRepository.findAll().get(0);
	}
	
	public Liga getLiga(String slug){
		for (Liga liga : ligaRepository.findAll()) {
			if (liga.getSlug().equals(slug)) return liga;
		}
		return null;
	}
	
	public void atualiza() {
		System.out.println("executando liga");
		try {
			LigaCartola ligaCartola = consulta(auth.getToken(), "/auth/liga/masters-br").get(LigaCartola.class);			
			for (Cartoleiro cartoleiro : ligaCartola.getTimes() ) {
				cartoleiroService.save(cartoleiro);
			}
			save(ligaCartola.getLiga());
		} catch (UnknownHostException e) {
			System.out.println("falha na consulta");
			e.printStackTrace();
		}
	}
	
	@Transactional
	public void save(Liga liga) {
		ligaRepository.save(liga);
	}
}
