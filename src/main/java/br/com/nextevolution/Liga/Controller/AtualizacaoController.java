package br.com.nextevolution.Liga.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.service.CampeonatoService;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.RodadaService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class AtualizacaoController {
	
	@Autowired private LigaService ligaService;
	@Autowired private MercadoService mercadoService;
	@Autowired private RodadaService rodadaService;
	@Autowired private CampeonatoService campeonatoService;
	@Autowired private TimeRodadaService timeRodadaService;
	
	@GetMapping("/atualiza")
	public String atualiza(){
		rodadaService.atualizaRodada();
		mercadoService.atualiza();
		ligaService.atualiza();
		timeRodadaService.atualiza();
		
		return "forward:/";
	}
	
	@GetMapping("/atualizaCampeonato")
	@ResponseBody
	public String atualizaCamponatos() {
		List<Campeonato> campeonatos = campeonatoService.getCampeonatos();
		
		if (campeonatos.isEmpty()) {		
			campeonatos = new ArrayList<Campeonato>();
			
			Campeonato pontosCorridos = new Campeonato("Masters Br",1,38,"Campeonato de pontos corridos");
			Campeonato mito = new Campeonato("Mito",1,38,"A melhor pontuação de todo o campeonato");
			Campeonato maisRico = new Campeonato("Mais Rico",1,38,"O time mais rico do campeonato");
			
			campeonatos.add(pontosCorridos);
			campeonatos.add(mito);
			campeonatos.add(maisRico);
			
			campeonatoService.saveAll(campeonatos);
		}
		
		return "ok";
	}

}
