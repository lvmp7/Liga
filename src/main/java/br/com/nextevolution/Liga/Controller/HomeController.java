package br.com.nextevolution.Liga.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.service.CartolaAuthenticationService;
import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class HomeController {
	
	@Autowired
	private CartolaAuthenticationService auth;
	@Autowired
	private MercadoService mercadoService;
	@Autowired
	private LigaService ligaService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mercado", mercadoService.getMercado(2));
		model.addAttribute("liga", ligaService.getLiga(auth.getToken(), "masters-br"));
		
		return "index";
	}
	
	@GetMapping("/regulamento")
	public String regulamento(Model model) {
		return "regulamento";
	}
}
