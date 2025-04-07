package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {

	@AfterTest
	public void lastExecution() {
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
		System.out.println("I will execute last");
	}
	@Parameters({"URL","APIkey/username"})
	@Test
	public void demo(String url, String key) {
		
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println(url);
		System.out.println(key);
	}
	@AfterSuite
	public void afSuite() {
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
		System.out.println("I last suite");
	}
	
	@Test
	public void secondDemo() {
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
		System.out.println("Bye");
	}

}
