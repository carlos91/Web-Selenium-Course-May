package com.ejerciciosTarea;

public class VerificadorSumaNumero {
	
	public static int suma(int n1, int n2) {
		
		return(n1+n2);
		
	}
	
	public static boolean verificador() {
		int x = suma(8,2);
		int n3 = 12;
		
		
		if(n3 == x){
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		
//		int n1 = 20;
//		int n2 = 88;
//		int n3 = 100;
//		
//		int suma = n1+n2;
//		if(n3 == suma){
//			System.out.println("la suma de: "+n1+" y de: "+n2+" es igual a: "+n3);
//		}else {
//			System.out.println("la suma de: "+n1+" y de: "+n2+" no es igual a: "+n3);
//		}
		boolean z = verificador();
		if (z == true){
			System.out.println("la suma es correcta");
			}else {
			System.out.println("la suma es incorrecta");
			}
		}
	}


