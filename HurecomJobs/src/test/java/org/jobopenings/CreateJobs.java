package org.jobopenings;

 

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Utility.Baseclass;
import Utility.Clients;
import Utility.Loginpage;

public class CreateJobs extends Baseclass {
	
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
        
        
        c.getJobopenings().click();
        
        c.getCreatejob().click();
        
        c.getJobid().sendKeys("AER93762");
        
        c.getJobrequirement().sendKeys("Sql developer");
        
        c.getNoofpositon().sendKeys("3");
        
        c.getDesignation().sendKeys("sql developer");
        
        c.getClient().click();
        
        c.getClientbutton().click();
        
        c.getClientlocaton().click();
        
        c.getClientlocaionbt().click();
        
        c.getClientSPOCs().click();
        
        c.getClientSPOCname().click();
        
        c.getMaximumctc().sendKeys("3");
        
        c.getMinexperience().sendKeys("0");
        
        c.getMaxexperience().sendKeys("2");
        
        c.getStatus().click();
        
        c.getStatusoption().click();
        
        c.getStatusgroup().click();
        
        Thread.sleep(3000);
        
        c.getStatusgroupotions().click();
        
        Thread.sleep(3000);
        
        Robot r=new Robot();
        
        c.getSkillsset().sendKeys("my sql");
        
        Thread.sleep(3000);
        
        r.keyPress(KeyEvent.VK_ENTER);
        
        c.getSkillsset().sendKeys("plsql");
        
        r.keyPress(KeyEvent.VK_ENTER);
        
        c.getSkillsset().sendKeys("good comminucation");
        
        r.keyPress(KeyEvent.VK_ENTER);
        
        
        c.getJobdescription().sendKeys("Help write and optimize in-application SQL statements\r\n"
        		+ "Ensure performance, security, and availability of databases\r\n"
        		+ "Prepare documentations and specifications\r\n"
        		+ "Handle common database procedures such as upgrade, backup, recovery, migration, etc.\r\n"
        		+ "Profile server resource usage, and optimize and tweak as necessary\r\n"
        		+ "Collaborate with other team members and stakeholders\r\n"
        		+ "{{Add other responsibilities here that are relevant}}");
        
        Thread.sleep(3000);
        
        c.getAssign().click();
        
        c.getAssingoptions().click();
        
        c.getBillduration().sendKeys("35");
        
        c.getCommission().click();
        
        c.getCommissionfixed().click();
        
        c.getRateofcommission().sendKeys("5000");
        
        c.getQualityaudit().click();
        
        c.getQualityauditbutton().click();
        
        c.getAddatachment().click(); 
        
        r.delay(3000);
        
        String file=("C:\\Users\\srike\\Downloads\\java full stack.pdf");
        
        StringSelection selection=new StringSelection(file); 
       
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection,null);
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_V);
        
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_V);
        
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        
        Thread.sleep(3000);
        
        c.getCreatebt().click();
        
        
         Assert.assertEquals(false, null);
        
        
        
	}  
        
        
        
        
        
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


