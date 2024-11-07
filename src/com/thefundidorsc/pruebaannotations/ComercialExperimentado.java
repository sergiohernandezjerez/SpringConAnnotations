package com.thefundidorsc.pruebaannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
@Scope("prototype")
public class ComercialExperimentado implements Empleados{
	
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
