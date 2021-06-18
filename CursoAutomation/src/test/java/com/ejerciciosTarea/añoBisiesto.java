package com.ejerciciosTarea;

public class añoBisiesto {
	public static boolean Bisiesto() {
		
		int a = año(0);
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
		int a = año(0);
		if(a >=1 && a <= 9999) {
			return true;
		}else {
			return false;
	}

}
	
	public static int año(int a) {
		
		return a = 1884;
}
	
	public static void main(String[] args) {
		
		boolean z = Confirmacion();
		boolean b = Bisiesto();
		int a = año(0);
		
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


