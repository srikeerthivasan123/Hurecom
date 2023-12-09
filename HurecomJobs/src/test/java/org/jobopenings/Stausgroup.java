package org.jobopenings;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
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

public class Stausgroup extends Baseclass {

	@BeforeClass
	private void beforeclass() throws InterruptedException {

		browserlauncher();
		maximize();
		time();
	}

	@BeforeMethod
	private void beforemethod() {

		Date d = new Date();
		System.out.println("start with" + d);
		System.out.println("before method");
		url("http://localhost:4200/#/login");

	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("end time" + new Date());
		System.out.println("after method");

	}

	@Test
	public void createstatus() throws InterruptedException, AWTException {

		
		Loginpage lp = new Loginpage();

		Clients c = new Clients();

		url("http://localhost:4200/#/login");

		Thread.sleep(3000);

		sendkeys(lp.getTxtuser(), "dhinu");

		sendkeys(lp.getTxtpass(), "dhinu123");

		sendkeys(lp.getCode(), "00002");

		lp.getLoginbt().click();

		Thread.sleep(3000);

		c.getClients().click();

		c.getStatusbt().click();

		c.getStatuscopybt().click();

		Thread.sleep(2000);

		c.getStatusgroupname().sendKeys("group 6");

		c.getStatusclonebtn().click();

		Thread.sleep(2000);

	}

	@Test
	private void updatestatus() throws InterruptedException {

		Loginpage lp = new Loginpage();

		Clients c = new Clients();

		url("http://localhost:4200/#/login");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sendkeys(lp.getTxtuser(), "dhinu");

		sendkeys(lp.getTxtpass(), "dhinu123");

		sendkeys(lp.getCode(), "00002");

		lp.getLoginbt().click();

		Thread.sleep(3000);

		c.getClients().click();

		c.getStatusbt().click();

		c.getEditbuttonstatus().click();

		c.getStatusgroupdropdown().click();

		c.getNoresposnsestatusbt().click();

		c.getCreatastatusbt().click();

		c.getEnterstatusname().sendKeys("conform again");

		c.getSavestatusbt().click();

		Thread.sleep(3000);

		c.getSuccessokbt().click();

		Thread.sleep(4000);

	}

	@Test
	private void updategroupname() throws Exception {

		Loginpage lp = new Loginpage();

		Clients c = new Clients();

		Actions a = new Actions(driver);

		Robot r = new Robot();

		url("http://localhost:4200/#/login");

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		sendkeys(lp.getTxtuser(), "dhinu");

		sendkeys(lp.getTxtpass(), "dhinu123");

		sendkeys(lp.getCode(), "00002");

		lp.getLoginbt().click();

		Thread.sleep(3000);

		c.getClients().click();

		c.getStatusbt().click();

		c.getEditbuttonstatus8().click();

		Thread.sleep(2000);

		WebElement updategroupname = c.getUpdategroupname();

		updategroupname.click();

		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);

		Thread.sleep(2000);
		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
 
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
 
		r.keyRelease(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);

	    c.getUpdategroupname().sendKeys("new group");
	    
	    c.getUpdatestatusbt().click();
		
        c.getUpdatesuccessokbt().click();    
	   
		
		 

	}

}
