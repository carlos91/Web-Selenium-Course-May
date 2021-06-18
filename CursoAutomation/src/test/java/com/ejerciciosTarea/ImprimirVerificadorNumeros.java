package com.ejerciciosTarea;

public class ImprimirVerificadorNumeros {

	public static void main(String[] args) {
		
		int n1 = 4;
		int n2 = 12;
		int n3 = 1;
		
		if(n1 <= 0 || n2 <= 0 || n3 <= 0) {
			System.out.println("Valor no valido");
		}else if(n1 == n2 && n2 == n3 && n1 == n3) {
			System.out.println("Todos los numeros son iguales.");
		}else if(n1 != n2 && n2 != n3 && n1 != n3) {
			System.out.println("Todos los numeros son diferentes.");
		}else{
			System.out.println("No todos los numeros son iguales.");
		}
	
	}

}
