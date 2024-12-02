package com.thefundidorsc.pruebaannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.xml.transform.Source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados{
	
	//ejecución de código después de creación del Bean
	@PostConstruct
	public void ejecutaDespuesCreación() {
		System.out.println("Ejecutado tras creación de Bean");
	}
	
	
	//ejecución de código después de apagado contenedor Spring
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes destrucción");
	}
	
	@Autowired
	@Qualifier("informeFinancieroTrim2")
	private CreacionInformeFinanciero informeFinanciero;
	
	/*@Autowired
	public ComercialExperimentado(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}*/

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}

	public CreacionInformeFinanciero getInformeFinanciero() {
		return informeFinanciero;
	}

	//@Autowired
	public void setInformeFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	

}
