package br.com.nextevolution.Liga.Controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.TimeRodada;
import br.com.nextevolution.Liga.service.CartoleiroService;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
@SessionAttributes({"liga,maisRico1","maisRico2","mito1","mito2"})
public class CampeonatoController {
	
	@Autowired 
	private LigaService ligaService;
	@Autowired 
	private CartoleiroService cartoleiroService;
	@Autowired 
	private TimeRodadaService timeRodadaService;
		
	@GetMapping("/hallfama")
	public String campeonatos(Model model) {
		return "hallfama";
	}
	
	@ModelAttribute("liga")
	public Liga liga() {
		return ligaService.getLiga();
	}
	
	@ModelAttribute("cartoleiros")
	public List<Cartoleiro> cartoleiros(){
		return cartoleiroService.getCartoleiros();
	}
	
	@ModelAttribute("maisRico1")
	public Cartoleiro maisRico1() {
		return cartoleiros().stream()
				.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
				.findFirst().get();
	}
	
	@ModelAttribute("maisRico2")
	public Cartoleiro maisRico2() {
		return cartoleiros().stream()
				.sorted(Comparator.comparing(Cartoleiro::getPatrimonio).reversed())
				.skip(1)
				.findFirst().get();
	}
	
	@ModelAttribute("mito1")
	public TimeRodada mito1() {
		return timeRodadaService.getTimes().stream().sorted(
				Comparator.comparing(TimeRodada::getPontos).reversed())
				.findFirst().get();
	}
	
	@ModelAttribute("mito2")
	public TimeRodada mito2() {
		return timeRodadaService.getTimes().stream().sorted(
				Comparator.comparing(TimeRodada::getPontos).reversed())
				.skip(1)
				.findFirst().get();
	}
}
