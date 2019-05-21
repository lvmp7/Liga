package br.com.nextevolution.Liga.Campeonato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.model.TimeRodada;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

public class VencedorRodada extends Campeonato{
	@Autowired TimeRodadaService timeRodadaService;
	@Autowired MercadoService mercadoService;
	
	@Override
	public List<TimeRodada> vencedores() {
		List<TimeRodada> vencedores = new ArrayList<TimeRodada>();
		Mercado mercado = mercadoService.getMercado();
		for (int i = 1; i < mercado.getRodada_atual(); i++) {
			if( mercado.getRodada_atual() != i)
				vencedores.add( 
					timeRodadaService.getTimes().stream().filter(t->t.getRodada() ==1)
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.findFirst().get()
					);
			else
				if(mercado.getStatus_mercado()==4) {
					vencedores.add(
					timeRodadaService.getTimes().stream().filter(t->t.getRodada() ==1)
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.findFirst().get()
					);
				}
		}
		return vencedores;
	}
}
