package br.com.nextevolution.Liga.Campeonato;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Rodada;


public class MitoDaRodada extends Campeonato {
	private Cartoleiro mito;
	private Cartoleiro viceMito;
	private Rodada mitagem;
	private Rodada viceMitagem;
	
	private void setMaiorPontuador(Cartoleiro cartoleiro, Rodada rodada) {
		if (mito.getPontos().getRodada() < cartoleiro.getPontos().getRodada()) {
			mito = cartoleiro;
			mitagem = rodada;
		}else {
			if (viceMito.getPontos().getRodada() < cartoleiro.getPontos().getRodada()) {
				viceMito = cartoleiro;
				viceMitagem = rodada;
			}
		}
	}
	
	public Cartoleiro getMito() {
		return mito;
	}
	
	public Cartoleiro getViceMito() {
		return viceMito;
	}
	
	public Rodada getMitagem() {
		return mitagem;
	}
	
	public Rodada getViceMitagem() {
		return viceMitagem;
	}
	
}
