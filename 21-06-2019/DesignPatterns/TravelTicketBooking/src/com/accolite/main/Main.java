package com.accolite.main;

import com.accolite.bookingBus.BookingBus;
import com.accolite.bookingTrain.BookingTrain;

public class Main {
	
	public static void main(String... args) {
		
		// Creating objects
		BookingBus b = new BookingBus();
		BookingTrain t = new BookingTrain();
		
		// Load home page and login
		System.out.println("Load home page and login");
		b.loadHomePage();
		b.login();	
		System.out.println();
		
		// getting and setting customer details
		System.out.println("getting and setting customer details");
		b.setCustomerDetails("Deepa", "92837560792");
		b.getCustomerDetails();
		System.out.println();
		
		// getting  and setting transport details
		System.out.println("getting  and setting transport details");
		b.getModeOfTransport();
		b.setTransportDetails("Adrithi", "12-2-2019", "9:30 AM", 23);
		b.getTransportDetails();
		System.out.println();
		
		//final report
		b.getReport();// Load home page and login
		System.out.println("Load home page and login");
		b.loadHomePage();
		b.login();	
		System.out.println();
		
		// getting and setting customer details
		System.out.println("getting and setting customer details");
		t.setCustomerDetails("Deepa Peri", "798989979700");
		t.getCustomerDetails();
		System.out.println();
		
		// getting  and setting transport details
		System.out.println("getting  and setting transport details");
		t.getModeOfTransport();
		t.setTransportDetails("Chennai Express", "14-4-2019", "12:30 AM", 26);
		t.getTransportDetails();
		System.out.println();
		
		//final report
		t.getReport();

		
		
		
		
		
		
	}

}
