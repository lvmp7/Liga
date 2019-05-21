package br.com.nextevolution.Liga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.CartoleiroRepository;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.TimeRodada;

@Service
public class CartoleiroService extends Consulta{
 	@Autowired private CartoleiroRepository cartoleiroRepository;
	@Autowired private CampeonatoService campeonatoService;
	
	@Transactional
	public List<Cartoleiro> getCartoleiros(){
		return cartoleiroRepository.findAll();
	}
	
	@Transactional
	public void save(Cartoleiro cartoleiro) {
		cartoleiroRepository.save(cartoleiro);
	}
	
	public void atualizaPremiacao() {
		List<Cartoleiro> cartoleiros = getCartoleiros();
		List<TimeRodada> vencedoresRodada = campeonatoService.vencedoresRodada();
		List<TimeRodada> viceRodada = campeonatoService.viceRodada();
		
		for (Cartoleiro cartoleiro : cartoleiros) {
			cartoleiro.setPremio(0);
			cartoleiro.setPremio(
					cartoleiro.getPremio() +
					vencedoresRodada.stream().filter(t-> t.getCartoleiro().equals(cartoleiro)).count() * 15 );
			cartoleiro.setPremio(
					cartoleiro.getPremio() +
					viceRodada.stream().filter(t-> t.getCartoleiro().equals(cartoleiro)).count() * 5 );
		}
		
		cartoleiroRepository.saveAll(cartoleiros);
	}

	public void atualizaEstatisticas() {
		List<Cartoleiro> cartoleiros = getCartoleiros();
		cartoleiros.forEach(c-> {
			campeonatoService.golsMarcados(c);
			campeonatoService.assistencias(c);			
		});
		cartoleiroRepository.saveAll(cartoleiros);
	}
}
