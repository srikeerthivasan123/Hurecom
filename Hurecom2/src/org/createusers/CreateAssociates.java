package org.createusers;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAssociates {
	public static void main(String[] args) throws InterruptedException {
		
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
		
	    driver.findElement(By.xpath("//li[@ptooltip='Teams']//a[@class='menu-link']")).click();
		
		driver.findElement(By.xpath(" //span[contains(@class,'p-button')]")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("srikeerthivasan");
		
		driver.findElement(By.xpath("//input[@formcontrolname='mobileNumber']")).sendKeys("8726876878");

		driver.findElement(By.xpath("( //input[@type='text'])[2]")).sendKeys("tamilsvanan@gmail.com");
		
		driver.findElement(By.xpath("//div[@role='button']")).click();
		
		
		driver.findElement(By.xpath("( //li[@role='option'])[3]")).click();
		
		
		driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath(" //li[@role='option']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
		
		driver.findElement(By.xpath("//li[@role='option']")).click();
		 
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("srkeerthivasan");
		 
//		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sri123456");
		
		driver.findElement(By.xpath("(//span[contains(@class,'p-dropdown-label ')])[4]")).click();
		
	 	driver.findElement(By.xpath("//li[@role='option']")).click();
		
//		driver.findElement(By.id("pr_id_18_label")).click();
		
//		WebElement status = driver.findElement(By.xpath("//span[contains(@class,'p-element p-dropdown')]"));
	//	
//		status.click();
		 
		
	    WebElement  create = driver.findElement(By.xpath("//span[normalize-space()='Create']"));
		
		create.click();
		
	    Thread.sleep(3000);
		
	    driver.findElement(By.xpath("//span[normalize-space()='Ok']")).click();
	 
		
		
	}

}
