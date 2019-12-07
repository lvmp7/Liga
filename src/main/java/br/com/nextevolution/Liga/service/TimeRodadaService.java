package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.ws.rs.core.GenericType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.TimeRodadaRepository;
import br.com.nextevolution.Liga.model.AtletaRodada;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.TimeRodada;

@Service
public class TimeRodadaService extends Consulta{
	@Autowired private TimeRodadaRepository timeRodadaRepository;
	@Autowired private CartoleiroService cartoleiroservice;
	@Autowired private MercadoService mercadoService;
	
	private List<TimeRodada> times = new LinkedList<>();
	
	@Transactional
	public void save(TimeRodada timeRodada) {
		timeRodadaRepository.save(timeRodada);
	}
	
	public List<TimeRodada> getAll() {
		return timeRodadaRepository.findAll();
		//return times;
	}
	
	public List<TimeRodada> getTimes(){
		if ( times.size() == 0)  {
			atualizaTodasRodadas();
		}
		return times;
		//return timeRodadaRepository.findAll();
	}
	
//	public List<TimeRodada> getParcialTimes(int rodada){
//		List<TimeRodada> timesRodada =  atualiza(rodada);
//		List<AtletaRodada> atletasRodada = pa
//		return times;
//		//return timeRodadaRepository.findAll();
//	}
	
	public void atualiza(int rodada) {	
		for (Cartoleiro cartoleiro : cartoleiroservice.getCartoleiros()) {				
			try {
				TimeRodada time = consulta("/time/id/"+cartoleiro.getId()+"/"+rodada).get(TimeRodada.class);
				//save( time );
				if(!times.contains(time))
					times.add(time);
			} catch (UnknownHostException e) {
				System.out.println("Falha na consulta ao TIMERODADA");
				e.printStackTrace();
			}
		}
	}
	
	public List<TimeRodada> getParcial(){
		List<TimeRodada> timesRodada = new ArrayList<TimeRodada>();
		
		for (Cartoleiro cartoleiro : cartoleiroservice.getCartoleiros()) {				
			try {
				TimeRodada time = consulta("/time/id/"+cartoleiro.getId()+"/"+mercadoService.getMercado().getRodada_atual()).get(TimeRodada.class);
				timesRodada.add(time);
			} catch (UnknownHostException e) {
				System.out.println("Falha na consulta ao TIMERODADA");
				e.printStackTrace();
			}
		}
		
		try {
			List<AtletaRodada> atletasPontuados = consulta("atletas/pontuados").get(new GenericType<List<AtletaRodada>>(){});
			System.out.println(atletasPontuados.get(0).getApelido());
			System.out.println(atletasPontuados.get(0).getPontuacao());
		} catch (UnknownHostException e) {
			System.out.println("falha na busca das parciais dos atletas "); 
			e.printStackTrace();
		}
		return timesRodada;
	}
	
	public List<TimeRodada> getTimes(int rodada){
		List<TimeRodada> timesRodada = new ArrayList<TimeRodada>();
		for (Cartoleiro cartoleiro : cartoleiroservice.getCartoleiros()) {				
			try {
				TimeRodada time = consulta("/time/id/"+cartoleiro.getId()+"/"+rodada).get(TimeRodada.class);
				timesRodada.add(time);
			} catch (UnknownHostException e) {
				System.out.println("Falha na consulta ao TIMERODADA");
				e.printStackTrace();
			}
		}
		return timesRodada;
	}
	
	
	public void atualizaTodasRodadas() {
		//times = new ArrayList<TimeRodada>();
		times = new LinkedList<>();
		for (int i = 1; i < mercadoService.getMercado().getRodada_atual() ; i++) {
			for (Cartoleiro cartoleiro : cartoleiroservice.getCartoleiros()) {				
				try {
					TimeRodada time = consulta("/time/id/"+cartoleiro.getId()+"/"+i).get(TimeRodada.class);
					//save( time );
					//times.addAll(getTimes(i));
					if ( time != null)
						times.add(time);
				} catch (UnknownHostException e) {
					System.out.println("Falha na consulta ao TIMERODADA");
					e.printStackTrace();
				}
			}
		}
	}
}
