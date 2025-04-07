package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeClass
	public void beforClas() {
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
		System.out.println("I will print before class");
	}
	@AfterClass
	public void afterClas() {
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
		System.out.println("I will print after class");
	}
	@Parameters({"URL"})
	@Test
	public void webLoginCarLoan(String urlname) {
		//selenium
		System.out.println("web login car");
		System.out.println(urlname);
	}
	@BeforeMethod
	public void beforeEvery() {
		System.out.println("Before Every Method I will execute");
	}
	
	
	@Test(groups = {"Smoke"})
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("mobile login car");
	}
	@BeforeSuite
	public void bfSuite() {
		
		System.out.println("I will execute before suite");
	}
	@Test(enabled = false)
	public void mobileSignInCarLoan() {
		//Appium
		System.out.println("mobile Sign in car");
	}
	@AfterMethod
	public void afterEvery() {
		System.out.println("I will execute after exery method");
	}
	@Test(dataProvider = "getData")                        //(timeOut = 4000)
	public void mobileSignOutCarLoan(String username, String password) {
		//Appium
		System.out.println("mobile Sign out car");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(dependsOnMethods = {"webLoginCarLoan","mobileSignOutCarLoan"})
	public void loginAPICarLoan() {
		//Rest Api
		System.out.println("Api login car");
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination - username password - good credit history
		//2nd username password - no credit history
		//3rd - fraudelent credit history
		Object[][] data = new Object[3][2];
		data[0][0] = "uday";
		data[0][1] = "pass";
		data[1][0] = "Noni"; 
		data[1][1] = "pass1"; 
		data[2][0] = "Yoyo"; 
		data[2][1] = "pass2"; 
		return data;
		
	}
 
}
