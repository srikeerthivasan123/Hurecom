package org.createusers;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateUser {
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
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("(//li[@class='p-element menu-item'])[8]")).click();
		
	    driver.findElement(By.xpath("//tbody/tr[8]/td[6]/span[1]/i[1]")).click();
	    
	    Actions a=new Actions(driver);
	    
	    WebElement  texts = driver.findElement(By.xpath("//input[@type='text']"));
	    
	    a.doubleClick(texts).doubleClick().perform();
	    
	    Robot r=new Robot();
	    
	   r.keyPress(KeyEvent.VK_SPACE);
	   
	   r.keyRelease(KeyEvent.VK_SPACE);
	   
	   texts.sendKeys("deepaks");
	   
	   driver.findElement(By.xpath("//button[@type='button']")).click();
	   
	   driver.findElement(By.xpath("(//button[contains(@class,'p-rippl')])[2]")).click();		
		
		
	}

}
