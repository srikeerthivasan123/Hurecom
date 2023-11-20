package org.forgotpassword;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resetting {
public static void main(String[] args) {
	

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\srike\\\\OneDrive\\\\Pictures\\\\hurecom bugs\\\\selenium\\\\chromedriver-win64\\\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
    driver.get("http://localhost:4200/#/reset-password?code=00001&token=35c20c1e-9aad-4f51-9ce3-85e81870fd2b");
    
    driver.manage().window().maximize();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sri123456");
    
    driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("sri123456");
	
    driver.findElement(By.xpath(" //p-button[@type='submit']")).click();	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
