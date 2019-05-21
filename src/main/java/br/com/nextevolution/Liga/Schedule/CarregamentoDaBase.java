package br.com.nextevolution.Liga.Schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.service.CartoleiroService;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.RodadaService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

@Component
@EnableScheduling
public class CarregamentoDaBase {
	@Autowired private RodadaService rodadaService;
	@Autowired private MercadoService mercadoService;
 	@Autowired private LigaService ligaService;
 	@Autowired private TimeRodadaService timeRodadaService; 
 	@Autowired private CartoleiroService cartoleiroService;
	
	private final long SEGUNDO = 1000;
	private final long MINUTO = SEGUNDO * 60;
	private final long HORA = MINUTO * 60;
 	
	@Scheduled(fixedDelay= SEGUNDO*10)
	public void atualizaBaseDados(){
		Mercado mercado = mercadoService.getMercado();
		if(mercado == null) {
			rodadaService.atualizaRodada();
			mercadoService.atualiza();
			ligaService.atualiza();
			timeRodadaService.atualizaTodasRodadas();
			cartoleiroService.atualizaPremiacao();
		}else{
			mercadoService.atualiza();
			Mercado novo = mercadoService.getMercado();
			if(mercado.getStatus_mercado() != novo.getStatus_mercado() ) {
				ligaService.atualiza();
				//timeRodadaService.atualiza(novo.getRodada_atual());
				timeRodadaService.atualizaTodasRodadas();
				cartoleiroService.atualizaEstatisticas();
				cartoleiroService.atualizaPremiacao();
			}
			cartoleiroService.atualizaEstatisticas();
		}
	}
}
