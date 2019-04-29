package br.com.nextevolution.Liga.service;

import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.MercadoRepository;
import br.com.nextevolution.Liga.model.Mercado;

@Service
public class MercadoService extends Consulta{
	@Autowired
	private MercadoRepository mercadoRepository;
	
	public void status() {
		Mercado mercado = null;
		try {
			mercado = consulta("/mercado/status").get(Mercado.class);
		} catch (UnknownHostException e) {
			System.out.println("Falha na comunicação com /mercado status");
			e.printStackTrace();
		}
		mercadoRepository.save(mercado);
	}
	
	public Mercado getMercado(int rodada) {
		status();
		return (Mercado) mercadoRepository.getOne(rodada);
	}
}
