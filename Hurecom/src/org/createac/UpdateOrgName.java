package org.createac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateOrgName {
public static void main(String[] args) throws InterruptedException, AWTException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\srike\\OneDrive\\Pictures\\hurecom bugs\\selenium\\chromedriver-win64\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("http://localhost:4200/#/login");
	
 	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement  username = driver.findElement(By.xpath("//input[@type='text']"));
	
	username.sendKeys("sri");
	
    WebElement  password = driver.findElement(By.xpath("//input[@type='password']"));
	
	password.sendKeys("sri1234");
	
	WebElement code = driver.findElement(By.xpath("(//input[contains(@class,'p-inputtext p-component')])[3]"));
	
	code.sendKeys("00001");
	
	WebElement loginbt = driver.findElement(By.xpath(" //button[@type='submit']"));
	
	loginbt.click(); 
	
	Thread.sleep(3000);
	
	driver.findElement(By.className("account-wrapper")).click();
	 
 	driver.findElement(By.xpath(" //span[normalize-space()='Control Panel']")).click();
 	
    driver.findElement(By.xpath("(//i[@class='pi pi-pencil'])[10]")).click();
    
    Actions as=new Actions(driver);
    
    WebElement orgname = driver.findElement(By.xpath(" //input[@type='text']"));
 
    
    Thread.sleep(3000);
 
    as.doubleClick(orgname).perform();
    
    Robot r=new Robot();
    
    r.keyPress(KeyEvent.VK_SPACE);
    r.keyRelease( KeyEvent.VK_SPACE);
    
    orgname.sendKeys("NPS");
    
    driver.findElement( By.xpath("//button[contains(@class,'p-ripple')]")).click();
    
    driver.findElement(By.xpath("(//button[contains(@class,'p-ripple p-element p-butt')])[3]")).click();
    
    
    
     
    
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
}
}
