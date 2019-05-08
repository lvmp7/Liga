package br.com.nextevolution.Liga.Controller;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.WebApplicationContext;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
@SessionAttributes({"maisRico1","maisRico2","mito1","mito2"})
public class CampeonatoController {
	
	
	@GetMapping("/campeonatos")
	public String campeonatos() {
		return "campeonatos";
	}
}
