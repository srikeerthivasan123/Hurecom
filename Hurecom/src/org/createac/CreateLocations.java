package org.createac;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLocations {
public static void main(String[] args) throws InterruptedException {
	
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
 	
 	driver.findElement(By.xpath("//tbody/tr[9]/td[3]/span[1]/i[1]")).click();
 	
 	driver.findElement( By.xpath(" //span[normalize-space()='Create Organization Location']")).click();
 	
 	Thread.sleep(3000);
 	
 	driver.findElement( By.xpath("//div[@class='p-dropdown p-component p-focus']//div[@aria-label='dropdown trigger']")).click();
	
	driver.findElement( By.xpath(" //li[@role='option']")).click();	
	
	driver.findElement(By.xpath("(//div[@class='p-dropdown-trigger'])[4]")).click();  
	
	WebElement scrolltamil = driver.findElement(By.xpath(" //li[@aria-label='Tamil Nadu']"));
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("arguments[0].scrollIntoView(true);",scrolltamil);
	
	driver.findElement(By.xpath("//li[@aria-label='Tamil Nadu']")).click(); 
	
	Thread.sleep( 3000);
	
	driver.findElement(By.xpath("//span[normalize-space()='Select City']")).click();
	
	driver.findElement( By.xpath("//li[@role='option']")).click();
	
	driver.findElement(By.xpath("//input[@class='p-inputtext p-component p-element ng-untouched ng-pristine ng-invalid']")).sendKeys("ADAMBAKKAMS");
 
	driver.findElement( By.xpath("//span[normalize-space()='Select Status']")).click();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath(" //span[@class='ng-star-inserted']")).click();
	
	driver.findElement( By.xpath("( //span[contains(@class,'p-button-label ng-star-inserted')])[4]")).click();
	
	Thread.sleep( 3000);
	 
	driver.findElement(By.xpath("(//span[@class='p-button-label ng-star-inserted'])[3]")).click();
	
	driver.findElement(By.xpath("(//button[@class='p-ripple p-element p-button p-component'])[3]")).click();
	
	Thread.sleep(3000); 
	
	WebElement ft = driver.findElement(By.xpath("//p-button[@label='Ok']//button[@type='button']"));
	 
	Alert alert = driver.switchTo().alert();
 
	alert.accept();
	
}
}
