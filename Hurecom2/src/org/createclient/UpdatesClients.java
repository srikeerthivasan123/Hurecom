package org.createclient;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpdatesClients {
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
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[3]/span[1]/i[1]")).click();

		driver.findElement(By.xpath("//tbody/tr[@class='ng-star-inserted']/td[6]/span[1]/i[1]")).click();
		
		Actions a=new Actions(driver);
		
		WebElement  branch = driver.findElement(By.xpath("//input[@formcontrolname='branch']"));
		
		a.doubleClick(branch).perform();
		
		branch.sendKeys("kodambakkam");
		
	    driver.findElement(By.xpath("(//span[@class='p-button-label ng-star-inserted'])[5]")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
