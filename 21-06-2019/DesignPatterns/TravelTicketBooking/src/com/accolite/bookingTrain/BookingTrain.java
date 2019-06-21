
package com.accolite.bookingTrain;

import com.accolite.bookingTemplate.BookingTemplate;

public class BookingTrain extends BookingTemplate{
	// Declaring transport name and its value
	private final static String transportName = "Train";
	
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
