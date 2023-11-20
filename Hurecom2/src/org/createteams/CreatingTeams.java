package org.createteams;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatingTeams {
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
		
	    driver.findElement(By.xpath("(//li[@class='p-element menu-item'])[8]")).click();
	    
	    Thread.sleep(1000);
		
	    driver.findElement(By.xpath("(//a[@role='presentation'])[2]")).click();
	    
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    
	    driver.findElement(By.cssSelector("input[type='text']")).sendKeys("AD003");
	    
	    driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("dragon");
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//div[@role='button']")).click();
	    
	    driver.findElement(By.xpath("//li[@role='option']")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='button'])[2]")).click();
	    
	    Thread.sleep(2000);
	     
	    driver.findElement(By.xpath("//li[@role='option']")).click();
	    
	    Thread.sleep(2000);
	     
        driver.findElement(By.xpath("(//div[@role='button'])[3]")).click();
	    
	    driver.findElement(By.xpath("//li[@role='option']")).click();
	    
	    driver.findElement(By.xpath(" //button[@type='button']")).click();
	    
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[3]")).click();
		
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[4]")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[5]")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[6]")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[7]")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[8]")).click();
	    
	    driver.findElement(By.xpath("(//div[@role='checkbox'])[9]")).click();
	    
	    driver.findElement(By.xpath("(//button[@type='button'])[5]")).click();
	     
	    driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		
		
	}

}
