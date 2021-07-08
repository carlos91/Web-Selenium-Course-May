package com.ejerciciosTarea;

public class añoBisiesto {
	
	
	 static int año = -2000;
	 
	 
	

	public static boolean Bisiesto() {
		int a = año;
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
		int a = año;
		if(a >=1 && a <= 9999) {
			return true;
			}else {
				return false;
				}
		}	

	
	public static void main(String[] args) {
		boolean z = Confirmacion();
		boolean b = Bisiesto();
		int a = año;
		
		if(z == true) {
			  if(b == true) {
				System.out.println(a+" es año bisiesto.");
			}else {
				System.out.println(a+" no es año bisiesto.");
			}
				
			}else {
				System.out.println("Parametro incorrecto.");
			}
	}

	
}


