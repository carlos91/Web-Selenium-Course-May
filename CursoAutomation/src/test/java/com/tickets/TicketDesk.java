package com.tickets;

public class TicketDesk {
	
//	public static void suma(double a, double b) {
//		System.out.println("Total: $" a + b);
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// inputs
		double price = 100;
		boolean isStudent = false;
		boolean descuento = false;
		int age = 59;
		
		TicketsParks ticket = new CoolParkTicket(price, isStudent, age);
		ticket.printPriceDay();
		double coolprice = ticket.getTicketPrice();
		
		//Testers PArk
		ticket = new TestersParkTicket(price, isStudent, age, descuento);
		ticket.printPriceDay();
		double testerprice = ticket.getTicketPrice();
		
		
		
		// Si es niño y estudiante que de otro precio. <--
		// Utilizar el metodo printPriceDay con la key como parametro. **
		// Agregar un constructor a la clase testersParkTicket que tenga un descuento especial. <-- ? ¿Por que al intercambiar los parametros del if no me sale el precio especial?
		// Generar un metodo static en TicketDesk que sume el total de los tickets e imprima el precio total.
	}
	

}
