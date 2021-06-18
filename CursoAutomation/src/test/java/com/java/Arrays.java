package com.java;

public class Arrays {
	
	public static void main(String[] args) {
		
		//Arreglo Unmidimensional
		
		String[] nombres = {"Ricardo", "Jessica", "Aide", "Felipe", "Luis", "Sandra"};
		
		//System.out.println("El nombre de la persona es: "+nombres[4]);
		
		for(int i = 0; i < nombres.length; i++) {
			System.out.println("El nombre de la persona es: "+ nombres[i]);
		}
		// Arreglo Bidimensional
		
		String[][] nombreEdad = new String[4][4];
		
		nombreEdad[0][0] = "Ricardo";
		nombreEdad[0][1] = "30";
		nombreEdad[1][0] = "Jessica";
		nombreEdad[1][1] = "31";
		nombreEdad[2][0] = "Aide";
		nombreEdad[2][1] = "32";
		nombreEdad[3][0] = "Felipe";
		nombreEdad[3][1] = "33";
		
		//System.out.println("El nombre de la persona es: "+nombreEdad[0][0]+" y su edad es: "+nombreEdad[0][1]);
		
		printNombreEdad(nombreEdad[0][0], nombreEdad[0][1]);

		System.out.println(suma(2, 2));
	}
	//metodo
	public static void printNombreEdad(String nombre, String edad) {
		System.out.println("MEtodo El nombre de la persona es: "+nombre+" y su edad es: "+edad);
	}
	public static int suma(int x, int y) {
		return x+y;
	}
}
