package com.thefundidorsc.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer el xml de configuració
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//pedir un bean al contenedor
		Empleados antonio = context.getBean("ComercialExperimentado", Empleados.class);
		
		
		//usar el bean
		System.out.println(antonio.getInforme());
		System.out.println(antonio.getTareas());
		
		
		
		//cerrar el contexto
		context.close();

	}

}
