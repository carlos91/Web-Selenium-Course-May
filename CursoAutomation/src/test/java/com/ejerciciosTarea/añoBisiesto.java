package com.ejerciciosTarea;

public class a�oBisiesto {
	
	
	 static int a�o = -2000;
	 
	 
	

	public static boolean Bisiesto() {
		int a = a�o;
		int x = 400;
		int y = 100;
		int z = 4;
		if(a%x != 0 && a%y != 0 && a%z != 0){
			return false;
			} else{
				return true;
				}
		}
	
	public static boolean Confirmacion() {
		int a = a�o;
		if(a >=1 && a <= 9999) {
			return true;
			}else {
				return false;
				}
		}	

	
	public static void main(String[] args) {
		boolean z = Confirmacion();
		boolean b = Bisiesto();
		int a = a�o;
		
		if(z == true) {
			  if(b == true) {
				System.out.println(a+" es a�o bisiesto.");
			}else {
				System.out.println(a+" no es a�o bisiesto.");
			}
				
			}else {
				System.out.println("Parametro incorrecto.");
			}
	}

	
}


