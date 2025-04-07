package test;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

//ITestListners is an interface which implements TestNg listeners

public class Listeners implements ITestListener {
	
	@Override
	public void onTestSuccess(ITestResult results) {
		System.out.println("Successfully executed listeners");
	}
	@Override
	public void onTestFailure(ITestResult results) {
		System.out.println("I Failed" + results.getName());
	}

}
