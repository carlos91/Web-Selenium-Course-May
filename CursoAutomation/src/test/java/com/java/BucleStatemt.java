package com.java;

public class BucleStatemt {

	public static void main(String[] args) {
		
		//While 
		
		int numero = 1;
		while(numero <= 10) {
			System.out.println("El numero es: "+numero);
			++numero;
		}
		//Do while
		// Cuantas veces se tiene que sumar un mismo numero para llegar a 100?
		
		int numeroLimite = 20;
		int sumTotal = 0;
		int count = 0;
		
		do {
		//	sumTotal = sumTotal + numeroLimite;
			sumTotal += numeroLimite;
			++count;
			
		}while(sumTotal < 100);
		
		System.out.println("el numero se sumo = "+count);
		
		//for 
		
		int numeroFor = 10;
		for(int i = 1; i <=numeroFor; i++) {
			System.out.println("El numero for es: "+ i);
		}
		

	}

}
