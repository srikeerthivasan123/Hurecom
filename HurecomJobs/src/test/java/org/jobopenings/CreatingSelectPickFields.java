package org.jobopenings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Baseclass;
import Utility.Clients;
import Utility.Loginpage;

public class CreatingSelectPickFields extends Baseclass {
	@BeforeClass
	private void beforeclass() throws InterruptedException {
		
		browserlauncher();
	    maximize();
	    time();
	}
	
	@BeforeMethod
	private void beforemethod() {
         
		Date d =new Date();
		System.out.println("start with"+d);
		System.out.println("before method");
	}
		


	
	 
	
	@AfterMethod
	private void aftermethod() {
		 System.out.println("end time"+new Date());
         System.out.println("after method");
	}
	 
	@Test
	private void test() throws InterruptedException, AWTException {
		
		Loginpage lp =new Loginpage();
		
		Clients c=new Clients();
		
		Robot r=new Robot();
		
		Actions a=new Actions(driver);
		
		Thread.sleep(3000);
		
		url("http://localhost:4200/#/login");
		
		sendkeys(lp.getTxtuser(),"sri");
		
        sendkeys(lp.getTxtpass(),"sri12345");
        
        sendkeys(lp.getCode(),"00002");
        
        lp.getLoginbt().click();
        
        Thread.sleep(3000);
        
        c.getClients().click();
        
        c.getExporttemplates().click();
        
        c.getCreateexportbutton().click();
       
        c.getTemplatename().sendKeys("HCL");
        
        c.getExportstatus().click();
        
        c.getStatusactive().click();
         
        c.getPickfields().click();
        
        Thread.sleep(2000);
        
        c.getMobilenumberfield().click();
        
        c.getEmailpickfields().click();
       
        c.getCandiatepickfields().click();
        
        c.getGender().click();
            
        c.getApplyfields().click();
        
        Thread.sleep(2000);
        
        c.getSumbitfields().click();
        
        c.getSuccessfields().click();
        
         
        
        
        
        
        
	}
        

}
