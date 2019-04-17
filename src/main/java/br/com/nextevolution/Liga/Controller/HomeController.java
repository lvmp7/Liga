package br.com.nextevolution.Liga.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.service.CartolaAuthenticationService;
import br.com.nextevolution.Liga.service.ConsultaService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class HomeController {
	@Autowired
	private ConsultaService consulta;
	@Autowired
	private CartolaAuthenticationService auth;
	
	@GetMapping("/")
	public String home(Model model) {
		//consulta.consultaLiga(auth.getToken("lvmp7@hotmail.com","treyce2504"), "/liga/masters-br");
		
		//model.addAttribute("mercado", new ConsultaService().consultaMercado("/mercado/status"));
		return "index";
	}
}
