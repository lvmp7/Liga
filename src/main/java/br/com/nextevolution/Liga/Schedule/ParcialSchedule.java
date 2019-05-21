package br.com.nextevolution.Liga.Schedule;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.model.Rodada;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.RodadaService;
import br.com.nextevolution.Liga.service.TimeRodadaService;


@EnableScheduling
public class ParcialSchedule {
	@Autowired private MercadoService mercadoService;
	@Autowired private RodadaService rodadaService;
	@Autowired private TimeRodadaService timeRodadaService;
	
	private final long SEGUNDO = 1000;
	
	@Scheduled(fixedDelay=SEGUNDO*5)
	public void atualizaParcial() {
		Mercado mercado = mercadoService.getMercado();
		if(!(mercado == null)) {
			Rodada rodada = rodadaService.getRodada(mercado.getRodada_atual());
			Calendar agora = Calendar.getInstance();
			
			if(agora.after(rodada.getInicio()) && agora.before(rodada.getFim()) ) {
				//timeRodadaService.atualiza(mercado.getRodada_atual());
			}
		}
	}
}
