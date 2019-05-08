package br.com.nextevolution.Liga.Campeonato;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;

public class Patrimonio extends Campeonato {
	@Override
	public List<Cartoleiro> vencedores(List<Cartoleiro> cartoleiros, int posicoes){		
		Collections.sort(cartoleiros, (Cartoleiro c1, Cartoleiro c2) -> 
				 Double.compare(c1.getPatrimonio(),c2.getPatrimonio())
		);		
		List<Cartoleiro> vencedores = new ArrayList<Cartoleiro>();
		for (int i = 0; i < posicoes; i++) {
			vencedores.add( cartoleiros.get(i) );
		}
		return vencedores;
	}
}
