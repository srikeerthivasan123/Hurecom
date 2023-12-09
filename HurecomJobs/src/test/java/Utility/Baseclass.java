package Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;

	public WebDriver browserlauncher() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void time() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

	}

	public void url(String Url) {
		driver.get(Url);
	}

	public static void sendkeys(WebElement k, String text) {
		k.sendKeys(text);
	}

	public static void click(WebElement k) {
		k.click();
	}

	// getattribute("value")
	public static String attribute(WebElement kk) {
		String kkk = kk.getAttribute("value");
		return kkk;
	}

	// getcurrent url

	public static String currenturl() {
		String txturl = driver.getCurrentUrl();
		return txturl;

	}

	// gettitle

	public static String title() {

		String title = driver.getTitle();
		return title;
	}

	// get text

	public static String text(WebElement k1) {
		String text = k1.getText();
		return text;
	}

	// Action doublelcick

	public static void doubleclick(WebElement txt) {

		Actions a = new Actions(driver);

		a.doubleClick(txt).perform();
	}

	// Action contextclick

	public static void contextclick(WebElement txt) {
		Actions a = new Actions(driver);
		a.contextClick(txt).perform();

	}

	// drag and drop

	public static void draganddrop(WebElement src, WebElement tar) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, tar).perform();

	}

	// simple Alert

	public static void simpleAlert() {

		Alert k2 = driver.switchTo().alert();
		k2.accept();

	}

	// comfrim alert

	public static void comfrimalert() {
		Alert k2 = driver.switchTo().alert();
		k2.dismiss();
	}

	// promt alert
	public static void promtalert(String value) {
		Alert k2 = driver.switchTo().alert();
		k2.sendKeys(value);
		k2.accept();

	}

	// select by index

	public static void selectbyindex(WebElement e, int n) {

		Select s = new Select(e);
		s.selectByIndex(n);

	}
	// select by value

	private static void selectbyvalue(WebElement e, String n) {

		Select s = new Select(e);
		s.selectByValue(n);
	}

	// select by visible text
	private static void selectbytext(WebElement e, String n1) {

		Select s = new Select(e);
		s.selectByVisibleText(n1);
	}

	// frame

	public static void frame(WebElement e) {

		driver.switchTo().frame(e);

	}

	public static void quit() {

		driver.quit();

	}

	public void screenshot(String file) throws IOException {

		/*
		 * LocalDate now = LocalDate.now(); DateTimeFormatter ofPattern =
		 * DateTimeFormatter.ofPattern("ddMMyyyHHmmss"); screenshotfolder =
		 * now.format(ofPattern);
		 */
		TakesScreenshot sc = (TakesScreenshot) driver;
		File sorce = sc.getScreenshotAs(OutputType.FILE);
		File to = new File("./screenshot/" + System.currentTimeMillis() + "/" + file);
		FileUtils.copyFile(sorce, to);

	}

}
