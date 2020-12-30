package test.logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomLogging implements ITestListener{
		
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method started: "+result.getName()+ " and time is: "+getCurrentTime());		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test method success: "+result.getName()+ " and time is: "+getCurrentTime());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test method failed: "+result.getName()+ " and time is: "+getCurrentTime());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test method skipped: "+result.getName()+ " and time is: "+getCurrentTime());		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// Leving blank
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test in a suite started: "+context.getName()+ " and time is: "+getCurrentTime());
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test in a suite finished: "+ context.getName()+ " and time is: "+getCurrentTime());
		
	}
	
	public String getCurrentTime(){
		DateFormat dateFormat = 
				new SimpleDateFormat("HH:mm:ss:SSS");
		Date dt = new Date();
		return dateFormat.format(dt);		
	}

}
