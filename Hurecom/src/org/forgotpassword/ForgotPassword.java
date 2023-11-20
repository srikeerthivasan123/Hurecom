package org.forgotpassword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPassword {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\srike\\\\OneDrive\\\\Pictures\\\\hurecom bugs\\\\selenium\\\\chromedriver-win64\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get("http://localhost:4200/#/login");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.findElement(By.xpath("//div[@class='forgot-password']")).click();
    
    driver.findElement(By.xpath(" //input[contains(@class,'p-inputtext ')]")).sendKeys("sri");
    
    driver.findElement(By.xpath(" (//input[contains(@class,'p-inputtext ')])[2]")).sendKeys("00001");
    
    driver.findElement( By.xpath(" //button[@type='submit']")).click();
    
    driver.findElement(By.xpath("//button[@type='button']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
