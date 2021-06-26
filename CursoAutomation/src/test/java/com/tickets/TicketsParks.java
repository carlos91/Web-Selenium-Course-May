package com.tickets;

public abstract class TicketsParks {
	
	//Constructor
	String welcomeMessage;
	
	public TicketsParks() {
		this.welcomeMessage = "Bienvenidos a Cooltesters Parks - ";
	}
	
	// Metodo obtener mensaje
	public String welcomeMessageString() {
		return this.welcomeMessage;
	}
	
	public abstract double getTicketPrice();
	public abstract void printPriceDay();
	public abstract void printPriceDay(String authKey, String priceDay);
	
	

}
