package com.accolite.bookingTemplate;

public class BookingTemplate {
	
	// Customer details
	private String customerName;
	private String customerContact;
	
	// Transport details
	private String transportTime;
	private int seatNumber;
	private String transportName;
	private String transportDate;
	
	// Get customer name
	public String getCustomerName() {
		return customerName;
	}
	
	// set customer name
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	// Get Customer contact
	public String getCustomerContact() {
		return customerContact;
	}
	
	// Set customer contact
	public void setCustomerContact(String customerContact) {
		this.customerContact = customerContact;
	}
	
	// Get Transport date
	public String getTransportDate() {
		return transportDate;
	}

	// Set Transport date
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}

	// Get transport time
	public String getTransportTime() {
		return transportTime;
	}

	// Set transport time
	public void setTransportTime(String transportTime) {
		this.transportTime = transportTime;
	}

	// Get seat number
	public int getSeatNumber() {
		return seatNumber;
	}
	// Set seat number
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	
	// get TransportName
	public String getTransportName() {
		return transportName;
	}
	
	// set Transport Name
	public void setTransportName(String transportName) {
		this.transportName = transportName;
	}

	
	// Load Home page
	public void loadHomePage() {
		System.out.println("Hello in Home Page");
	}
		
	// Login
	public void login() {
		System.out.println("Logged in ");
	}
	
	// Get Transport details
	public void getTransportDetails() {
		System.out.println("Transport mode : " + transportName);
		System.out.println("Transporting Date: " + this.transportDate);
		System.out.println("Transporting time :" + this.transportTime);
		System.out.println("Seat number : " + seatNumber);
	}
		
	// Set Transport details
	public void setTransportDetails(String transportName, String transportDate, String transportTime, int seatNumber) {
		this.setSeatNumber(seatNumber);
		this.setTransportDate(transportDate);
		this.setTransportName(transportName);
		this.setTransportTime(transportTime);
	}
	
	// Get Customer details
	public void getCustomerDetails() {
		System.out.println("customer name: " + this.customerName);
		System.out.println("customer contact: " + this.customerContact);
	}
	// Set Customer Details
	public void setCustomerDetails(String customerName, String customerContact) {
		this.customerName = customerName;
		this.customerContact = customerContact;
	}
	
		
}
