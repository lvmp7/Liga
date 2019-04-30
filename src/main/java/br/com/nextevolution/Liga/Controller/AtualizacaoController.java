package br.com.nextevolution.Liga.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import br.com.nextevolution.Liga.service.LigaService;
import br.com.nextevolution.Liga.service.MercadoService;

@Controller
@Scope(value=WebApplicationContext.SCOPE_SESSION)
public class AtualizacaoController {
	
	@Autowired
	LigaService ligaService;
	@Autowired
	MercadoService mercadoService;
	
	@GetMapping("/atualiza")
	@ResponseBody
	public String atualiza(){
		ligaService.atualiza();
		mercadoService.atualiza();
		return "ok";
	}
	
}
