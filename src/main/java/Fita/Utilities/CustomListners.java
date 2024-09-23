package Fita.Utilities;

import java.io.IOException;

import org.openqa.selenium.devtools.v122.page.Page.CaptureScreenshotFormat;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Baseclass.Baseclass;

public class CustomListners extends Baseclass implements ITestListener{

	public void onTestStart(ITestResult result) {
	    System.out.println(result.getName()+""+result.getStatus());
	    test= Extent.createTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
	System.out.println(result.getMethod()+""+result.getStatus());
	test.log(Status.PASS, "");
	try {
		CaptureScreenshot();
	}
	catch (IOException e) {
		e.printStackTrace();
		
	}
	test.addScreenCaptureFromPath("-"
			+ "");
	}
	
	

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
	
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}
	
	


}
