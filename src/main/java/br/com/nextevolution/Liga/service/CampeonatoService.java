package br.com.nextevolution.Liga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.CampeonatoRepository;
import br.com.nextevolution.Liga.model.Campeonato;

@Service
public class CampeonatoService extends Consulta{
	@Autowired
	private CampeonatoRepository campeonatoRepository;
	
	public void atualiza() {
		
	}
	
	public void save(Campeonato campeonato) {
		campeonatoRepository.save(campeonato);
	}

	public void saveAll(List<Campeonato> campeonatos) {
		campeonatoRepository.saveAll(campeonatos);
	}

	public List<Campeonato> getCampeonatos() {
		return campeonatoRepository.findAll();
	}
	
}
