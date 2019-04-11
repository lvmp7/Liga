package br.com.nextevolution.Liga.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

import br.com.nextevolution.Liga.model.Cartola;
import br.com.nextevolution.Liga.model.Liga;
import br.com.nextevolution.Liga.model.Time;

public class LigaService {
	@XmlAttribute(name="convites_enviados")
	private List<Cartola> convitesEnviados;
	private List<Time> times;
	
	private Liga liga;
	private boolean membro;
	private int pagina;
	private List <Cartola> pedidos;
	@XmlAttribute(name="time-dono")
	private Time timeDono;
	@XmlAttribute(name="time_usuario")
	private Time timeusuario;
	
	
	

}
