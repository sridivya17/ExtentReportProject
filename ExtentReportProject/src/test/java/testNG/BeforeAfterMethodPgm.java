package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodPgm {
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I am in Before Method in git ");
		System.out.println("Change made for the third commit");
	}
	@Test
	public void testMethod() {
		System.out.println("I am in Test method");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("I am in After Method in git");
	}
	
	

}
