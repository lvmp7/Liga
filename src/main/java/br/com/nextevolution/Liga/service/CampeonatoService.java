package br.com.nextevolution.Liga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Repository.CampeonatoRepository;
import br.com.nextevolution.Liga.model.Campeonato;

@Service
public class CampeonatoService {
	@Autowired
	private CampeonatoRepository campeonatoRepository;
	
	public void save(Campeonato campeonato) {
		campeonatoRepository.save(campeonato);
	}
	
}
