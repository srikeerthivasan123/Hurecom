package org.jobopenings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
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

public class Updatingjobs extends Baseclass {
	
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
		
		Actions a=new Actions(driver);
		
		Robot r=new Robot();
		
		Thread.sleep(3000);
		
		url("http://localhost:4200/#/login");
		
		sendkeys(lp.getTxtuser(),"sri");
		
        sendkeys(lp.getTxtpass(),"sri12345");
        
        sendkeys(lp.getCode(),"00002");
        
        lp.getLoginbt().click();
        
        Thread.sleep(3000);
        
        c.getClients().click();
        
        c.getRecutiername().click();
        
         
        
        
       
         
        Thread.sleep(3000);
         
        
        WebElement designation = c.getDesignation();
        
        designation.click();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_A);
        
        r.keyPress(KeyEvent.VK_SPACE);
        r.keyRelease(KeyEvent.VK_SPACE);
        
		 
		  Thread.sleep(3000);
		  
		  designation.sendKeys("SQL developer");
		  
		  
		  WebElement minexperience = c.getMinexperience();
		  
		  a.doubleClick(minexperience).perform();
		  
		  r.keyPress(KeyEvent.VK_SPACE); r.keyRelease(KeyEvent.VK_SPACE);
		  
		  minexperience.sendKeys("1");
		  
		  c.getUpdatebt().click();
		  
	      c.getSumbitfields().click();
		    
		 
	} 
        

}
