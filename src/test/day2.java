package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	@Test(groups = {"Smoke"})
	public void pLoan() {
		System.out.println("Good");
	}
	
	@BeforeTest
	public void prerequiste() {
		System.out.println("I will execute first");
	}
}
