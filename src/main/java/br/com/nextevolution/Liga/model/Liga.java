package br.com.nextevolution.Liga.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

public class Liga {
	@XmlAttribute(name="convites_enviados")
	private List<Convite> convitesEnviados;
	private List<Time> times;
	

}
