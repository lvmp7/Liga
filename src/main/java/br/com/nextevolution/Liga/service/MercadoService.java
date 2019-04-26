package br.com.nextevolution.Liga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Repository.MercadoRepository;
import br.com.nextevolution.Liga.model.Mercado;

@Service
public class MercadoService{
	@Autowired
	private MercadoRepository mercadoRepository;
	
	public void save(Mercado mercado) {
		mercadoRepository.save(mercado);
	}
	
	
}
