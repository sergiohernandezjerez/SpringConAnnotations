package com.thefundidorsc.pruebaannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leer el xml de configuració
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//pedir un bean al contenedor
		Empleados antonio = context.getBean("ComercialExperimentado", Empleados.class);
		Empleados maria = context.getBean("ComercialExperimentado", Empleados.class);
		
		if(antonio == maria) {
			System.out.println("Apuntan al mismo lugar");
			System.out.println(antonio + " \n" + maria);
		}else {
			System.out.println("No apuntan al mismo lugar");
			System.out.println(antonio + " \n" + maria);
		}
		
		context.close();

	}

}
