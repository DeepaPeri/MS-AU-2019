package com.accolite.bookingBus;

import com.accolite.bookingTemplate.BookingTemplate;

public class BookingBus extends BookingTemplate{
	
	// Declaring transport name and its value
	private final static String transportName = "Bus";

	// Get mode of transport
	public void getModeOfTransport() {
		System.out.println("Mode of Transport: "+transportName);
	}
	
	// Get report
	public void getReport() {
		this.getCustomerDetails();
		this.getTransportDetails();
		System.out.println("Mode of transport: " + transportName);
	}

}
