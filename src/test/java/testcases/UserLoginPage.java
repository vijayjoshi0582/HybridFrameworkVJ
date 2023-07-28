package testcases;

import org.testng.annotations.Test;

public class UserLoginPage {
	
	@Test
	public void loginTest(String username, String password){
		
		System.out.println("Inside user login method()");
		
		System.out.println("UserName -->"+username+" || "+"Password -->"+password);
	}

}