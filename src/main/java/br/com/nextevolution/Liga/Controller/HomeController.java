package br.com.nextevolution.Liga.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.model.Cartoleiro;
import br.com.nextevolution.Liga.service.CartoleiroService;
import br.com.nextevolution.Liga.service.MercadoService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class HomeController {
	
	@Autowired
	private MercadoService mercadoService;
	@Autowired
	private CartoleiroService cartoleiroService;
	
	@GetMapping("/")
	public String home(Model model) {
		
		model.addAttribute("mercado", mercadoService.getMercado(2));
		addAttributos(model, cartoleiroService.getCartoleios());
		
		return "index";
	}

	private void addAttributos(Model model, List<Cartoleiro> cartoleiros) {
		Cartoleiro maiorPatrimonio1 = cartoleiros.get(0);
		Cartoleiro maiorPatrimonio2 = cartoleiros.get(1);
		
		for (int i = 1; i < cartoleiros.size(); i++) {	
			if (cartoleiros.get(i).getPatrimonio() > maiorPatrimonio1.getPatrimonio()) {
				maiorPatrimonio2 = maiorPatrimonio1;
				maiorPatrimonio1 = cartoleiros.get(i); 
				
			}else {
				if(cartoleiros.get(i).getPatrimonio() > maiorPatrimonio2.getPatrimonio()) {
					maiorPatrimonio2 = cartoleiros.get(i);
				}
			}
		}
		
		model.addAttribute("cartoleiros", cartoleiros);
		model.addAttribute("maisRico1",maiorPatrimonio1) ;
		model.addAttribute("maisRico2",maiorPatrimonio2) ;
	}
	
	@GetMapping("/regulamento")
	public String regulamento(Model model) {
		return "regulamento";
	}
}
