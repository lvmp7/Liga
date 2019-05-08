package br.com.nextevolution.Liga.Campeonato;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;


public class MitoDaRodada extends Campeonato {
	
	private Cartoleiro mito;
	private Cartoleiro viceMito;
	private int mitagem;
	private int viceMitagem;
	
//	@Autowired
//	private RodadaService rodadaService;
	
	public MitoDaRodada() {
	}
	
	public MitoDaRodada(String nome, int rodadaInicio, int rodadaFim, String descricao) {
		super(nome, rodadaInicio, rodadaFim, descricao);
	}
	
//	@Override
//	public List<Cartoleiro> campeoes(List<Cartoleiro> cartoleiros) {
//		
//		for (int i = getInicio(); i < getFim(); i++) {
//			Rodada rodada = rodadaService.getRodada(i);
//			if( rodada.getFim().after(new Date()) && rodada.getId() < i ) {				
//			
//				for (Cartoleiro cartoleiro : cartoleiros) {
//					if (mito.getPontos().getRodada() < cartoleiro.getPontos().getRodada()) {
//						mito = cartoleiro;
//						mitagem = i;
//					}else {
//						if (viceMito.getPontos().getRodada() < cartoleiro.getPontos().getRodada()) {
//							viceMito = cartoleiro;
//							viceMitagem = i;
//						}
//					}
//				}
//			}else {
//				break;
//			}
//		}
//		return Arrays.asList(mito,viceMito);
//	}
	
	public Cartoleiro getMito() {
		return mito;
	}
	
	public Cartoleiro getViceMito() {
		return viceMito;
	}
	
	public int getMitagem() {
		return mitagem;
	}
	
	public int getViceMitagem() {
		return viceMitagem;
	}
	
}
