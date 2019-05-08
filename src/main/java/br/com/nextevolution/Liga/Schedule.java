package br.com.nextevolution.Liga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.RodadaService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

@Component
@EnableScheduling
public class Schedule {
	@Autowired private RodadaService rodadaService;
	@Autowired private MercadoService mercadoService;
 	@Autowired private LigaService ligaService;
 	@Autowired private TimeRodadaService timeRodadaService; 
	
	private final long SEGUNDO = 1000;
	private final long MINUTO = SEGUNDO * 60;
	private final long HORA = MINUTO * 60;
 	
	@Scheduled(fixedDelay= MINUTO)
	public void atualizaBaseDados(){
		Mercado mercado = mercadoService.getMercado();
		if(mercado == null) {
			rodadaService.atualizaRodada();
			mercadoService.atualiza();
			ligaService.atualiza();
			timeRodadaService.atualiza();
		}
	
	
		
		
		
	}

	
	
	
	
}
