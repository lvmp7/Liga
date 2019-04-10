package br.com.nextevolution.Liga.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.nextevolution.Liga.service.Consulta;

@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("mercado", new Consulta().statusMercado());
		return "home";
	}
}
