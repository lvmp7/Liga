package br.com.nextevolution.Liga.Controller;

import java.util.NoSuchElementException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {
	
	@ExceptionHandler(Exception.class)
	public ModelAndView error(Exception e) {
		e.printStackTrace();
		ModelAndView modelAndView = new ModelAndView("error");
		
		message("");
		
		return modelAndView;
	}
	
	@ExceptionHandler(NoSuchElementException.class)
	public ModelAndView errorAtualizacaoDadosDobanco(NoSuchElementException e) {
		e.printStackTrace();
		ModelAndView modelAndView = new ModelAndView("error");
		message("Não foi possivel carregar os dados do banco de dados, Tente novamente em 1 min");
		
		return modelAndView;
	}
	
	@ModelAttribute("msg")
	public String message(String msg) {
		return msg;
	}
}
