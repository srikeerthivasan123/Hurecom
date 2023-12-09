package org.step;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Stepdef {
	
static WebDriver driver;


//
@Given("User should navigate to app")
public void user_should_navigate_to_app() {
   WebDriverManager.chromedriver().setup();
   
   driver= new ChromeDriver();
   
   driver.get("https://www.facebook.com/");
   
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
   
}

@Given("User enter the username as keerthis")
public void user_enter_the_username_as_keerthis() {
    
	driver.findElement(By.id("email")).sendKeys("keerthi");
	
//   
//}
//
//@Given("user enter the password as keeethi1234")
//public void user_enter_the_password_as_keeethi1234() {
//    driver.findElement(By.id("pass")).sendKeys("kaaerhi");
//   
//}
//
//@When("User click on the login button")
//public void user_click_on_the_login_button() throws InterruptedException {
//     driver.findElement(By.name("login")).click();
//     
//     Thread.sleep(1000);
//     
//     driver.close();
//   
//}
//
//@When("Login not successful")
//public void login_not_successful() {
//   
//   System.out.println("login not success");
//}
//
//
//@Given("User should navigate to appication")
//public void user_should_navigate_to_appication() {
//	 WebDriverManager.chromedriver().setup();
//	   
//	   driver= new ChromeDriver();
//	   
//	   driver.get("https://www.facebook.com/");
//	   
//	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//    
//}
//
//@Given("User enter the username as {string}")
//public void user_enter_the_username_as(String username) {
//	driver.findElement(By.id("email")).sendKeys(username);
//	   
//}
//
//@Given("user enter the password as {string}")
//public void user_enter_the_password_as(String password) {
//	 driver.findElement(By.id("pass")).sendKeys(password);
//    
//}
//
//
	
}
