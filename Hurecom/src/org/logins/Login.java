package org.logins;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\srike\\OneDrive\\Pictures\\hurecom bugs\\selenium\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://beta.hurecom.com/#/login");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement createbt = driver.findElement(By.className("create-account"));
		
		createbt.click();

		WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
		
		name.sendKeys("sri keerthi");
		
		WebElement email = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		email.sendKeys("mersalkeerthi111@gmail.com");
		
		WebElement mobilenum = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		
		mobilenum.sendKeys("9677506292");
		
		WebElement companyname = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		
		companyname.sendKeys("graceful Technology");
		 
		
 	     WebElement countrydrp = driver.findElement(By.xpath(" //span[contains(@class,'p-dropdown-label')]"));
		 
 	     countrydrp.click();
 	     
 	     WebElement india = driver.findElement(By.xpath(" //li[@role='option']"));
		 
		 india.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement statedrp = driver.findElement(By.xpath("( //span[contains(@class,'p-dropdown-label')])[2]"));
		 
		 statedrp.click();
		 
		 WebElement state = driver.findElement(By.xpath(" //li[@role='option']"));
		 
		 state.click();
		 
		 Thread.sleep(3000);
 	 
		 WebElement citydrp = driver.findElement(By.xpath("( //span[contains(@class,'p-dropdown-label')])[3]"));
		 
		 citydrp.click();
		 
		 WebElement city = driver.findElement(By.xpath(" (//li[@role='option'])[1]"));
		 
		 city.click();
		 
		 Thread.sleep(3000);
		 
		 WebElement branch = driver.findElement(By.xpath(" (//input[@type='text'])[8]"));
		
		 branch.sendKeys("avadi");
		 
		 WebElement username = driver.findElement(By.xpath(" (//input[@type='text'])[9]"));
		 
		 username.sendKeys("srikeerthi");
		 
		 WebElement pass = driver.findElement(By.xpath(" //input[@type='password']"));
		 
		 pass.sendKeys("srikeerthi123");
		 
		 
		 WebElement createbn = driver.findElement(By.xpath("  //button[@type='button']"));
		 
		 createbn.click();
		
		
		
		
		
		
		
}
 

}