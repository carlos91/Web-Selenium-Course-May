package com.java;

public class LimiteVelocidad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int velocidad = 110; //KM/H
		int limiteVelocidad = 100;
		
//		if(velocidad > limiteVelocidad) {
//			System.out.println("¡¡Multa!!");
//		}else {
//			System.out.println("EL coche va a buena velocidad");
//		}
		//if anidado / IF ELSE
		
		boolean highway = true;
		
		if(highway) {
			System.out.println("Estamos conduciendo en una Autopista");
			
			limiteVelocidad = 120;
			
			if(velocidad > limiteVelocidad) {
				System.out.println("¡¡Multa!!");
			}else {
				System.out.println("EL coche va a buena velocidad");
			}
		}else if(velocidad > limiteVelocidad) {
			System.out.println("El coche esta en una calle y va a exceso de velocidad, Multa!!");
		}else {
			System.out.println("EL coche esta en una calle y va a una buena velocidad");
		}
		
		// Switch Case
		
		int temperatura = 35;
		
		switch(temperatura) {
		case 5:
			System.out.println("Mucho Frio");
			break;
		
		case 10:
			System.out.println("Frio");
			break;
			
		case 20:
			System.out.println("Templado");
			break;
		
		case 35:
			System.out.println("Calor");
			break;
			
			default:
				System.out.println("no encontro relacion con la temperatura");
				break;
		}
	}

	
}
