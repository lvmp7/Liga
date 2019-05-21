package br.com.nextevolution.Liga.Campeonato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.TimeRodada;
import br.com.nextevolution.Liga.service.TimeRodadaService;

public class MitoDaRodada extends Campeonato {
	
	@Autowired private TimeRodadaService timeRodadaService;
	private TimeRodada mito;
	private TimeRodada vicemito;
	
	public MitoDaRodada() {	
		this.mito = timeRodadaService.getTimes().stream().sorted(
				Comparator.comparing(TimeRodada::getPontos).reversed())
				.findFirst().get();
		
		this.vicemito = timeRodadaService.getTimes().stream().sorted(
				Comparator.comparing(TimeRodada::getPontos).reversed())
				.skip(1)
				.findFirst().get();
	}

	public TimeRodada getMito() {
		return mito;
	}
	
	public TimeRodada getViceMito() {
		return vicemito;
	}
	
	@Override
	public List<TimeRodada> vencedores() {
		List<TimeRodada> vencedores = new ArrayList<TimeRodada>();
		vencedores.add(mito);
		vencedores.add(vicemito);
		return vencedores;
	}
}