package org.listeners;

import java.io.IOException;

import org.jobopenings.CreateJobsLeavingField;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LitenersPage extends CreateJobsLeavingField implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			screenshot(result.getName()+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

	@Override
	public void onTestStart(ITestResult result) {
		 System.out.println("Test is goind to start");
		 
	}
	
	
	


}
