package st;

import java.time.Duration;

import ho.Baseclass;
import ho.Facebbok;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class steps extends Baseclass {
	
 Facebbok k=new Facebbok();

@Given("user in facebook")
public void userInFacebook() {
	
	browserlauncher();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.get("https://www.facebook.com/");
}
    
@When("click the fb")
public void clickTheFb() {
	
    k.getUser().sendKeys("keerthi");
}


}

