package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.TimeRodadaRepository;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.TimeRodada;

@Service
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class TimeRodadaService extends Consulta{
	@Autowired private TimeRodadaRepository timeRodadaRepository;
	@Autowired private CartoleiroService cartoleiroservice;
	@Autowired private MercadoService mercadoService;
	private List<TimeRodada> times = new ArrayList<TimeRodada>();
	
	@Transactional
	public void save(TimeRodada timeRodada) {
		timeRodadaRepository.save(timeRodada);
	}
	
	public List<TimeRodada> getAll() {
		return timeRodadaRepository.findAll();
	}
	
	public List<TimeRodada> getTimes(){
		return times;
		//return timeRodadaRepository.findAll();
	}
	
	public void atualiza() {
		for (int i = 1; i < mercadoService.getMercado().getRodada_atual() ; i++) {			
			for (Cartoleiro cartoleiro : cartoleiroservice.getCartoleiros()) {
				
				try {
					TimeRodada time = consulta("/time/slug/"+cartoleiro.getSlug()+"/"+i).get(TimeRodada.class);
					//save( time );
					times.add(time);
				} catch (UnknownHostException e) {
					System.out.println("Falha na consulta ao TIMERODADA");
					e.printStackTrace();
				}
				
			}
		}
	}
	
}
