package org.update;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateTeams {
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\srike\\OneDrive\\Pictures\\hurecom bugs\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://localhost:4200/#/login");
		
	 	driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement  username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("sri");
		
	    WebElement  password = driver.findElement(By.xpath("//input[@type='password']"));
		
		password.sendKeys("sri12345");
		
		WebElement code = driver.findElement(By.xpath("(//input[contains(@class,'p-inputtext p-component')])[3]"));
		
		code.sendKeys("00002");
		
	    WebElement loginbt = driver.findElement(By.xpath(" //button[@type='submit']"));
		
		loginbt.click(); 
		
		driver.findElement(By.xpath("//li[@ptooltip='Teams']//a[@class='menu-link']")).click();
		
	    driver.findElement(By.xpath("(//a[@role='presentation'])[2]")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//i[@class='pi pi-pencil']")).click();
	    
	    Actions a=new Actions(driver);
	    
	    WebElement codes = driver.findElement(By.xpath("//input[@type='text']"));
		
	    a.doubleClick(codes).perform();
	    
	    Robot r=new Robot();
	    
	    r.keyPress(KeyEvent.VK_SPACE);
	    r.keyRelease(KeyEvent.VK_SPACE);
	    
	    codes.sendKeys("ADS0012");
	    
	     WebElement  name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    
	     a.doubleClick(name).perform();
	     
	     r.keyPress(KeyEvent.VK_SPACE);
		 r.keyRelease(KeyEvent.VK_SPACE);
		 
		 
		 name.sendKeys("newslist");
		 
		 driver.findElement(By.xpath("(//i[@class='pi pi-trash'])[4]")).click();
		 
		 driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	     
	      
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		
	}

}
