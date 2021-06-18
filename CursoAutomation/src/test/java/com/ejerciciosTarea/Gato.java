package com.ejerciciosTarea;

public class Gato {

	
	public static void main(String[] args) {
		int temp = 5;
		int juegoInf = 25;
		int juegoSup = 35;
		boolean verano = false;
//		boolean verano = veranoTemp();
		
		if (verano == true) {
			System.out.println("Es verano.");
			int tempVerano = 45;
			if (temp <= tempVerano && temp >= juegoInf) {
				System.out.println("El gato sale a jugar.");
			}else {
				System.out.println("El gato no sale a jugar.");
			}
		}else if(temp <= juegoSup && temp >= juegoInf) {
			System.out.println("El gato sale a jugar.");
		}else {
			System.out.println("el gato no sale a jugar.");
		}

	
	}
//	public static boolean veranoTemp(){
//		int temp = 36;
//		if(temp >= 45 && temp >= 36 ) {
//			return true;
//		}else {
//			return false;
//		}
//		
//	}
}

