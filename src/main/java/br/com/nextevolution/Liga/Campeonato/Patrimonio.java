package br.com.nextevolution.Liga.Campeonato;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.service.CartoleiroService;

public class Patrimonio extends Campeonato {
	@Autowired private CartoleiroService cartoleiroService;
	
	public List<Cartoleiro> ricos(){		
		List<Cartoleiro> vencedores = new ArrayList<Cartoleiro>();
		
		Cartoleiro maisRico = cartoleiroService.getCartoleiros().stream()
			.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
			.findFirst().get();
		Cartoleiro maisRico2 = cartoleiroService.getCartoleiros().stream()
				.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
				.skip(1)
				.findFirst().get();
		
		vencedores.add(maisRico);
		vencedores.add(maisRico2);
		
		return vencedores;
	}
}
