package br.com.nextevolution.Liga.Controller;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import br.com.nextevolution.Liga.Campeonato.MitoDaRodada;
import br.com.nextevolution.Liga.model.Campeonato;
import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.Mercado;
import br.com.nextevolution.Liga.model.TimeRodada;
import br.com.nextevolution.Liga.service.CartoleiroService;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;
import br.com.nextevolution.Liga.service.TimeRodadaService;

@Controller
@SessionAttributes({"mercado","liga","cartoleiros","maisRico1","maisRico2","mito1","mito2"})
public class HomeController {
	
	@Autowired private MercadoService mercadoService;
	@Autowired private LigaService ligaService;
	@Autowired private CartoleiroService cartoleiroService;
	@Autowired private TimeRodadaService timeRodadaService;
	private Campeonato mito;
	
	@GetMapping("/")
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/regulamento")
	public String regulamento(Model model) {
		return "regulamento";
	}
	
	@ModelAttribute("mercado")
	public Mercado mercado() {
		return mercadoService.getMercado();
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
		List<TimeRodada> times = timeRodadaService.getTimes();
		TimeRodada timeRodada = new TimeRodada();

		if (times.size() > 0) {

			timeRodada = times.stream().sorted(
					Comparator.comparing(TimeRodada::getPontos).reversed())
					.findFirst().get();
		}

		return timeRodada;
	}
	
	@ModelAttribute("mito2")
	public TimeRodada mito2() {
		List<TimeRodada> times = timeRodadaService.getTimes();
		TimeRodada timeRodada = new TimeRodada();

		if (times.size() > 0) {
			timeRodada = times.stream().sorted(
					Comparator.comparing(TimeRodada::getPontos).reversed())
					.skip(1)
					.findFirst().get();
		}

		return timeRodada;
	}
}
