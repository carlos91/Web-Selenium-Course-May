package com.tickets;

public class TestersParkTicket extends TicketsParks {

	double adultTicket;
	double childTicket;
	double studentTicket;
	double studentChildTicket;
	double specialDiscount;
	boolean student = false;
	boolean discount;
	String priceDay;
	String park;
	int age;

	public TestersParkTicket(double price, boolean student, int age, boolean discount) {
		super();
		this.adultTicket = price;
		this.childTicket = price * (0.85);
		this.studentTicket = price * (0.6);
		this.studentChildTicket = price *(0.80);
		this.specialDiscount = price *(0.90);
		this.discount = discount;
		this.student = student;
		this.priceDay = "Precio dia regurar";
		this.park = "Testers Park";
		this.age = age;
	}

	// Encapsulation
	private void setPriceDay(String priceday) {
		this.priceDay = priceDay;
	}

	private String getPriceDay() {
		return priceDay;
	}

	@Override
	public double getTicketPrice() {
		double priceTicket;

		if (age >= 18 && !student && discount) {
			priceTicket = specialDiscount;
			System.out.println("Precio adulto especial: $" + specialDiscount);
		}else if(age >= 18 && !student){
			priceTicket = adultTicket;
			System.out.println("Precio adulto: $"+adultTicket);
		}else if (age >= 18 && student) {
			priceTicket = studentTicket;
			System.out.println("Precio estudiante: $" + studentTicket);
		}else if(age<=18 && student){
			priceTicket = studentChildTicket;
			System.out.println("Precio por ser Estudiante y niño: "+studentChildTicket);
		}else {
			priceTicket = childTicket;
			System.out.println("Precio Niño: $" + childTicket);
		}
		return priceTicket;
	}

	@Override
	public void printPriceDay() {
		System.out.println(welcomeMessageString() + park + getPriceDay());

	}

	@Override
	public void printPriceDay(String authKey, String priceDay) {
		setPriceDay(priceDay);
		System.out.println(welcomeMessageString() + park + getPriceDay());
	}

}
