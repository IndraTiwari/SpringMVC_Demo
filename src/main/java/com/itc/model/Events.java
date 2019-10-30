package com.itc.model;

public class Events {
	String eventTitle;
	String city;
	double ticketPrice;
	String eventType;

	public Events() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Events(String eventTitle, String city, double ticketPrice, String eventType) {
		super();
		this.eventTitle = eventTitle;
		this.city = city;
		this.ticketPrice = ticketPrice;
		this.eventType = eventType;
	}



	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	@Override
	public String toString() {
		return "Events [eventTitle=" + eventTitle + ", city=" + city + ", ticketPrice=" + ticketPrice + ", eventType="
				+ eventType + "]";
	}

}
