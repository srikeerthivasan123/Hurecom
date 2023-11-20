package org.createac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangeLocatoinDetails {
public static void main(String[] args) throws InterruptedException {
	
//	(//i[@class='pi pi-pencil'])[10]
	
	
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
 	
 	Thread.sleep(3000);
 	
 	driver.findElement(By.xpath("(//i[@class='pi pi-pencil'])[10]")).click();
 	
 	driver.findElement(By.xpath("//i[@class='pi pi-pencil']")).click();
 	
 	Thread.sleep(3000);
 	
 	
 	driver.findElement(By.xpath("(//div[@role='button'])[4]")).click();
 	
    WebElement scrolltamil = driver.findElement(By.xpath(" //li[@aria-label='Tamil Nadu']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",scrolltamil);
	
	driver.findElement(By.xpath("//li[@aria-label='Tamil Nadu']")).click(); 
	
    driver.findElement(By.xpath("( //div[@class='p-dropdown p-component'])[3]")).click();
 	
    driver.findElement( By.xpath("//li[@role='option']")).click();
    
	driver.findElement( By.xpath("( //span[contains(@class,'p-button-label ng-star-inserted')])[4]")).click();
	
	Thread.sleep( 3000);
	 
	driver.findElement(By.xpath("(//span[@class='p-button-label ng-star-inserted'])[3]")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
