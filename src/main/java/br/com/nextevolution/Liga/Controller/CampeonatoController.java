package br.com.nextevolution.Liga.Controller;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.TimeRodada;
import br.com.nextevolution.Liga.service.CampeonatoService;
import br.com.nextevolution.Liga.service.CartoleiroService;
import br.com.nextevolution.Liga.service.LigaService;

@Controller
@SessionAttributes({"cartoleiros,liga,maisRico1","maisRico2","mito1","mito2","vencedoresRodada"})
public class CampeonatoController {
	
	@Autowired private LigaService ligaService;
	@Autowired private CartoleiroService cartoleiroService;
	@Autowired private CampeonatoService campeonatoService;
	
	@GetMapping("/hallfama")
	public String hallFama() {
		return "hallfama";
	}
	
	@GetMapping("/tabela")
	public String tabela() {
		return "tabela";
	}
	
	@ModelAttribute("liga")
	public Liga liga() {
		return ligaService.getLiga();
	}
	
	@ModelAttribute("cartoleiros")
	public List<Cartoleiro> cartoleiros(){
		return cartoleiroService.getCartoleiros().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
	}
	
	@ModelAttribute("maisRico1")
	public Cartoleiro maisRico1() {
		return campeonatoService.maisRico();
	}
	
	@ModelAttribute("maisRico2")
	public Cartoleiro maisRico2() {
		return campeonatoService.segundoMaisRico();
	}
	
	@ModelAttribute("mito1")
	public TimeRodada mito1() {
		return campeonatoService.mito();
	}
	
	@ModelAttribute("mito2")
	public TimeRodada mito2() {
		return campeonatoService.viceMito();
	}
	
	@ModelAttribute("vencedoresRodada")
	public List<TimeRodada> vencedoresRodada(){
		return campeonatoService.vencedoresRodada();
	}
	
	public List<TimeRodada> viceRodada(){
		return campeonatoService.viceRodada();
	}	
}
