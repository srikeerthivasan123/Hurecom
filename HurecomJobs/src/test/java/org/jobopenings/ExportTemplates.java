package org.jobopenings;

import java.awt.AWTException;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Baseclass;
import Utility.Clients;
import Utility.Loginpage;

public class ExportTemplates extends Baseclass{
	

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
        
        c.getTemplatename().sendKeys("HCL Tech");
        
        c.getExportstatus().click();
        
        c.getStatusactive().click();
        
        Thread.sleep(2000);
        
        c.getPickfields().click();
        
        Thread.sleep(3000);
      
        c.getSelectallfields().click();
         
        c.getApplyfields().click();
        
        Thread.sleep(2000);
        
        c.getSumbitfields().click();
        
    
        Thread.sleep(2000);
        
        String text = c.getErrormessageexporttemplates().getText();
        
        String errors="Export Template Name already exists.";
        
        if(text==errors) {
        	c.getOkbtforerrortemplate().click();
        }
        
        else {
        
        c.getSuccessfields().click();
        
        
             
        
	}
	}     
        
	
}
