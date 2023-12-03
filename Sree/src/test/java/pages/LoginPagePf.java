package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePf {
	
	WebDriver driver;
	
	public LoginPagePf() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="email")
	WebElement txtusername;
	
	@FindBy(id="pass")
	WebElement txtpassword;
	
	@FindBy(name="login")
	WebElement loginbt;
	
	
	public void enterusername(String username) {
		
		txtusername.sendKeys(username);
	}
	
	
	public void enterpassword(String password) {
		  txtpassword.sendKeys(password);

	}
	
	
	public void clicklogin() {
		 loginbt.click();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
