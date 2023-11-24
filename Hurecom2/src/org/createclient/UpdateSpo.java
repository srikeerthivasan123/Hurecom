package org.createclient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdateSpo {
	public static void main(String[] args) {

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
		
		driver.findElement(By.xpath("/html/body/app-root/div[1]/app-side-bar/div/div/div/div[2]/ul/li[7]/a")).click();
		
		driver.findElement(By.xpath("//tbody/tr[7]/td[3]/span[1]/i[1]")).click();
		
		driver.findElement(By.xpath("//span[normalize-space()='Client Spocs']")).click();
		
		driver.findElement(By.xpath("//i[@class='pi pi-pencil']")).click();
		
		Actions a=new Actions(driver);
		
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[5]"));
		
		a.doubleClick(name).perform();
		
		name.sendKeys("deepak anusha");
		
		driver.findElement(By.xpath("//div[@class='button-wrapper']//span[@class='p-button-label ng-star-inserted'][normalize-space()='Update']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
