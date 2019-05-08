package br.com.nextevolution.Liga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextevolution.Liga.Consulta;
import br.com.nextevolution.Liga.Repository.CartoleiroRepository;
import br.com.nextevolution.Liga.model.Cartoleiro;

@Service
public class CartoleiroService extends Consulta{
	@Autowired
	CartoleiroRepository cartoleiroRepository;
	
	@Transactional
	public List<Cartoleiro> getCartoleiros(){
		return cartoleiroRepository.findAll();
	}
	
	@Transactional
	public void save(Cartoleiro cartoleiro) {
		cartoleiroRepository.save(cartoleiro);
	}
}
