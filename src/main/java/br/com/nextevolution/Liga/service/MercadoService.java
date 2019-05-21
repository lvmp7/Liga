package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;
import java.util.Comparator;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.MercadoRepository;
import br.com.nextevolution.Liga.model.Mercado;

@Service
public class MercadoService extends Consulta{
	@Autowired
	private MercadoRepository mercadoRepository;
	
	public Mercado getMercado(){
		Optional<Mercado> optionalMercado = mercadoRepository.findAll().stream()
		.sorted(Comparator.comparing(Mercado::getRodada_atual).reversed())
		.findFirst();
		
		if (optionalMercado.isPresent())
			return optionalMercado.get();
		
		return null;
	}
	
	@Transactional
	public Mercado getMercado(int rodada) {
		return mercadoRepository.getOne(rodada);
	}

	public void atualiza() {
		try {
			save(consulta("/mercado/status").get(Mercado.class));
		} catch (UnknownHostException e) {
			System.out.println("Falha na comunicação com /mercado status");
			e.printStackTrace();
		}
	}
	@Transactional
	public void save(Mercado mercado) {
		mercadoRepository.save(mercado);
	}
}