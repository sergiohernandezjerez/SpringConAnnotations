package com.thefundidorsc.pruebaannotations;

import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
public class ComercialExperimentado implements Empleados{

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Vender, vender y vender más!";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Este es un informe de un comercial experimentado";
	}

}
