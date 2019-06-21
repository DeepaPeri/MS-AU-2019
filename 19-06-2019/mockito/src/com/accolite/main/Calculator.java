package com.accolite.main;

public class Calculator {
	SampleService sampleService;
	public Calculator(SampleService sampleService) {
		this.sampleService = sampleService;
	}
	public int add(int i, int j) {
		int a= sampleService.getValue();
		return i+j+a;
	}
	public int division(int i, int j) {
		return i/j;
	}
	public int getInt() {
		return 1;
	}
	
	
}