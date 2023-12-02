package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage extends Baseclass {
	
	public Loginpage()
	{
		 PageFactory.initElements(driver, this);
	 
	}
	
	
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement txtuser;
	
	
	@FindBy(xpath="//input[@type='password']")
	public WebElement txtpass;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement loginbt;
	
	@FindBy(xpath="(//input[contains(@class,'p-inputtext p-component')])[3]")
	public WebElement code;

	public WebElement getCode() {
		return code;
	}

	public WebElement getTxtuser() {
		return txtuser;
	}

	public WebElement getTxtpass() {
		return txtpass;
	}

	public WebElement getLoginbt() {
		return loginbt;
	}
	
	
    
	
	
	
	

	/*
	 * WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
	 * 
	 * username.sendKeys("sri");
	 * 
	 * WebElement password =
	 * driver.findElement(By.xpath("//input[@type='password']"));
	 * 
	 * password.sendKeys("sri12345");
	 * 
	 * WebElement code = driver.findElement(By.
	 * xpath("(//input[contains(@class,'p-inputtext p-component')])[3]"));
	 * 
	 * code.sendKeys("00002");
	 * 
	 * WebElement loginbt =
	 * driver.findElement(By.xpath(" //button[@type='submit']"));
	 * 
	 * loginbt.click();
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
