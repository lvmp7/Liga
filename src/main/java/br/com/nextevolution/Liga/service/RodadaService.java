package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;
import java.util.List;

import javax.ws.rs.core.GenericType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.RodadaRepository;
import br.com.nextevolution.Liga.model.Rodada;

@Service
public class RodadaService extends Consulta {
	@Autowired
	private RodadaRepository rodadaRepository;

	public void atualizaRodada() {
		List<Rodada> rodadas = null;
		try {
			rodadas = consulta("/rodadas").get(new GenericType<List<Rodada>>() {});
			for (Rodada rodada : rodadas) {
				rodadaRepository.save(rodada);
			}
		} catch (UnknownHostException e) {
			System.out.println("Falha na consulta a /rodadas");
			e.printStackTrace();
		}
	}

}
