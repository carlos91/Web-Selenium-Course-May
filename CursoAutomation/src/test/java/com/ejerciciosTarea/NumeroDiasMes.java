package com.ejerciciosTarea;

public class NumeroDiasMes extends añoBisiesto{
	
	public static void main(String[] args) {
		int mes = 2;
		int a = año(0);
		boolean z = Confirmacion();
		boolean y = Bisiesto();
		
		if (z == true) {
			switch (mes) {
				case 1:
					System.out.println("Enero tiene 31 dias.");
					break;
				case 2:
					if(y == true) {
						System.out.println(a+ " es año bisiesto por lo tanto Febrero tiene 29 dias.");
					}else {
						System.out.println(a+ " no es año bisiesto por lo tanto Febrero tiene 28 dias.");
					}
					break;
				case 3:
					System.out.println("Marzo tiene 31 dias");
					break;
				case 4:
					System.out.println("Abril tiene 30 dias");
					break;
				case 5:
					System.out.println("Mayo tiene 31 dias");
					break;
				case 6:
					System.out.println("Junio tiene 30 dias");
					break;
				case 7:
					System.out.println("Julio tiene 31 dias");
					break;
				case 8:
					System.out.println("Agosto tiene 31 dias");
					break;
				case 9:
					System.out.println("Septiembre tiene 30 dias");
					break;
				case 10:
					System.out.println("Octubre tiene 31 dias");
					break;
				case 11:
					System.out.println("Noviembre tiene 30 dias");
					break;
				case 12:
					System.out.println("Diciembre tiene 31 dias");
					break;
				default:
					System.out.println("Parametro incorrecto");
					break;
			}
		}else {
			System.out.println("Parametro incorrecto");
		}
		

	}
//@Override
//public static int año(int a) {
//	
//	return a = 1883;
//	
//}

	
}


