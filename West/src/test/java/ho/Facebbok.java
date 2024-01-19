package ho;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebbok extends Baseclass{


	public WebElement getLogin() {
		return login;
	}

	public Facebbok() {
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(id= "email")
	public WebElement user;
	
	@FindBy(name = "pass")
	public WebElement pass;
	
	@FindBy(xpath= "//button[@type='submit']")
	public WebElement  login;
	
	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}
	
	
}
