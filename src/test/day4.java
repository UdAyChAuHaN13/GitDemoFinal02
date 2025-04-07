package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class day4 {

	@Test
	public void webLoginHomeLoan() {
		//selenium
		System.out.println("web login home");
	}
	
	@Test(groups = {"Smoke"})
	public void mobileLoginHomeLoan() {
		//Appium
		System.out.println("mobile login home");
	}
	
	@Test
	public void loginAPIHomeLoan() {
		//Rest Api
		System.out.println("Api login home");
		Assert.assertTrue(false);
	}

}
