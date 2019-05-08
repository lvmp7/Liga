package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;

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
	private Mercado mercado;
	
	public Mercado getMercado(){
		return mercado;
	}
	@Transactional
	public Mercado getMercado(int rodada) {
		return mercadoRepository.getOne(rodada);
	}

	public void atualiza() {
		try {
			this.mercado = consulta("/mercado/status").get(Mercado.class);
			save(mercado);
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
