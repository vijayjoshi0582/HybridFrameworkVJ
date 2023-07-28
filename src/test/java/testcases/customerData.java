package testcases;

import org.testng.annotations.Test;

public class customerData {
	
	@Test
	public void customerRegistration(String name, String business){
		
		System.out.println("Inside user customer Registration method()");
		
		System.out.println("customerName -->"+name+" || "+"business -->"+business);
	}

}
