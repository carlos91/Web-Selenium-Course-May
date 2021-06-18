package com.java;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Operadores Aritmeticos
		
		int x = 6;
		int y = 4;
		
		int z = x+y;
		System.out.println("El valor de la variable Z: "+z);
		z= x-y;
		System.out.println("El valor de la variable z: "+z);
		z= x*y;
		System.out.println("El valor de la variable z: "+z);
		z= x/y;
		System.out.println("El valor de la variable z: "+z);
		
		//Operadores Unarios
		
		int A = 1;
		int B = 2;
		
		++A;
		--B;
		
		A = 4;
		
		System.out.println("El valor de A es: " + A);
		System.out.println("El valor de B es: "+ B);
		
		//Operadores relecionales
		
		if(B < A) {
			System.out.println("Block code");
		}
		
		//Operadores Condicionales
		
		int var1 = 5;
		int var2 = 7;
		int var3 = 7;
		int var4 = 8;
		
		if(var1 == var2 || var3 == var4 || var2 == var3) {
			System.out.println("Conditional Block code");
			
		}
		
	}

}
