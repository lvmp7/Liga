package br.com.nextevolution.Liga.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Repository.CampeonatoRepository;
import br.com.nextevolution.Liga.model.Atleta;
import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.model.Rodada;
import br.com.nextevolution.Liga.model.TimeRodada;

@Service
public class CampeonatoService{
	@Autowired private CampeonatoRepository campeonatoRepository;
	@Autowired private MercadoService mercadoService;
	@Autowired private TimeRodadaService timeRodadaService;
	@Autowired private RodadaService rodadaService;
	@Autowired private CartoleiroService cartoleiroService;
	
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
	
	public TimeRodada mito() {
		return timeRodadaService.getTimes().stream().sorted(
			Comparator.comparing(TimeRodada::getPontos).reversed())
			.findFirst().get();
	}
	public TimeRodada viceMito() {
		return timeRodadaService.getTimes().stream().sorted(
			Comparator.comparing(TimeRodada::getPontos).reversed())
			.skip(1)
			.findFirst().get();
	}
	
	public Cartoleiro maisRico() {
		return cartoleiroService.getCartoleiros().stream()
				.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
				.findFirst().get();
	}
	
	public Cartoleiro segundoMaisRico() {
		return cartoleiroService.getCartoleiros().stream()
				.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
				.skip(1)
				.findFirst().get();
	}
			
	public List<TimeRodada> vencedoresRodada(){
		List<TimeRodada> vencedores = new ArrayList<TimeRodada>();
		Mercado mercado = mercadoService.getMercado();
		
		for (int i = 1; i <= mercado.getRodada_atual(); i++) {
			if( mercado.getRodada_atual() != i) {
				int rodada = i; 
				vencedores.add( 
					timeRodadaService.getTimes().stream().filter( t-> t.getRodada()== rodada )
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.findFirst().get()
					);
			}else {
				if(mercado.getStatus_mercado()==4) {
					int rodada = i;
					vencedores.add(
					timeRodadaService.getTimes().stream().filter(t->t.getRodada() == rodada)
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.findFirst().get()
					);
				}
			}
		}
		return vencedores;
	}
	public Cartoleiro golsMarcados(Cartoleiro cartoleiro) {
			List<Atleta> atletas = new ArrayList<Atleta>();
			timeRodadaService.getTimes().stream().filter(t-> t.getCartoleiro().equals(cartoleiro))
			.forEach(t-> atletas.addAll(t.getAtletas()) );
			cartoleiro.setGols( atletas.stream().collect(Collectors.summingInt(a->a.getScout().getGol())) );			
		return cartoleiro;
	}
	
	public Cartoleiro assistencias(Cartoleiro cartoleiro) {
			List<Atleta> atletas = new ArrayList<Atleta>();
			timeRodadaService.getTimes().stream().filter(t-> t.getCartoleiro().equals(cartoleiro))
			.forEach(t-> atletas.addAll(t.getAtletas()) );
			cartoleiro.setAssistencias( atletas.stream().collect(Collectors.summingInt(a->a.getScout().getAssistencia())) );
			return cartoleiro;
	}
	
	public List<TimeRodada> viceRodada(){
		List<TimeRodada> vencedores = new ArrayList<TimeRodada>();
		Mercado mercado = mercadoService.getMercado();
		
		for (int i = 1; i <= mercado.getRodada_atual(); i++) {
			if( mercado.getRodada_atual() != i) {
				int rodada = i; 
				vencedores.add( 
					timeRodadaService.getTimes().stream().filter( t-> t.getRodada()== rodada )
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.skip(1)
					.findFirst().get()
					);
			}
			else
				if(mercado.getStatus_mercado()==4) {
					int rodada = i;
					vencedores.add(
					timeRodadaService.getTimes().stream().filter(t->t.getRodada() == rodada)
					.sorted(Comparator.comparing(TimeRodada::getPontos).reversed())
					.skip(1)
					.findFirst().get()
					);
				}
		}
		return vencedores;
	}
	
	public List<Cartoleiro> vencedoresMes(){
		List<Cartoleiro> vencedores = new ArrayList<Cartoleiro>();
		List<Rodada> rodadas = rodadaService.getAll();
		
		atualizaVencedores(
				rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.APRIL ).collect(Collectors.toList())
				, vencedores);
		
		atualizaVencedores(
				rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.MAY ).collect(Collectors.toList())
				, vencedores);
		
		atualizaVencedores(
				rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.MAY ).collect(Collectors.toList())
				, vencedores);
		
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.JUNE ).collect(Collectors.toList()) 
			, vencedores);
	
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.JULY ).collect(Collectors.toList())
			, vencedores);
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.AUGUST ).collect(Collectors.toList())
			,vencedores);
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.SEPTEMBER ).collect(Collectors.toList())
			,vencedores);
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.OCTOBER ).collect(Collectors.toList())
			,vencedores);
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.NOVEMBER ).collect(Collectors.toList())
			,vencedores);
		
		atualizaVencedores(
			rodadas.stream().filter(r -> r.getInicio().MONTH == Calendar.DECEMBER ).collect(Collectors.toList())
			,vencedores);
		
		return vencedores;
	}
	
	private List<Cartoleiro> pontuacaoDoMes(List<Rodada> rodadasDoMes) {
		List<Cartoleiro> cartoleiros = cartoleiroService.getCartoleiros().stream().collect(Collectors.toList());
		for (Cartoleiro cartoleiro : cartoleiros) {
			cartoleiro.getPontos().setMes(calculaPontosMes(rodadasDoMes, cartoleiro) );
		}
		return cartoleiros;
	}
	
	private double calculaPontosMes(List<Rodada> rodadas, Cartoleiro cartoleiro) {
		List<TimeRodada> time = timeRodadaService.getAll().stream().filter(t-> t.getCartoleiro().equals(cartoleiro)).collect(Collectors.toList());
		List<TimeRodada> timesMes = new ArrayList<TimeRodada>();
		
		for (Rodada rodada : rodadas) {
			timesMes.addAll(time.stream().filter(t -> t.getRodada() == rodada.getId()).collect(Collectors.toList()) );
		}
		return timesMes.stream().collect(Collectors.summingDouble(TimeRodada::getPontos));		
	}
	
	private void atualizaVencedores(List<Rodada> rodadaMes,List<Cartoleiro> vencedores) {
		int ultimaRodada = rodadaMes.get(rodadaMes.size()-1).getId();
		Mercado mercado = mercadoService.getMercado();
		
		if( (mercado.getRodada_atual() >= ultimaRodada) && (mercado.getStatus_mercado()!=1) ){
			vencedores.add( pontuacaoDoMes(	rodadaMes )
					.stream().sorted(Comparator.comparing(c->((Cartoleiro) c).getPontos().getMes()).reversed())			
					.findFirst().get());				
		}
	}
}
