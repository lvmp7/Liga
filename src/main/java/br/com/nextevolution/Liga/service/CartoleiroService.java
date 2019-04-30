package br.com.nextevolution.Liga.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.nextevolution.Liga.Repository.CartoleiroRepository;
import br.com.nextevolution.Liga.model.Cartoleiro;

@Service
public class CartoleiroService {
	@Autowired
	CartoleiroRepository cartoleiroRepository;
	
	public List<Cartoleiro> getCartoleios(){
		return cartoleiroRepository.findAll();
	}
}
