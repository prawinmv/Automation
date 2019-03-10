package com.web.app;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.junit.*;

public class ParallelTest {
	public static WebDriver driver;

@Parameters("browser")
@BeforeClass	
public static void setUp(String browser){

if(browser.equalsIgnoreCase("firefox")) {
	 	
	System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
	 	driver = new FirefoxDriver();	 
	 
	  }else if (browser.equalsIgnoreCase("chrome")) { 
	 
	 
	   System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
	 
	   driver = new ChromeDriver();
	 
	  } 





}

@Test
public static void homePage() {
	driver.get("https://www.google.com");
	String pageTitle1=driver.getTitle();
	System.out.println(pageTitle1);
	
		
	//WebElement element = driver.findElement(By.linkText("Gmail"));	
	WebElement element = driver.findElement(By.name("q"));	

	webWait(element);
	element.sendKeys("epf");
	element.submit();
	
	String pageTitle2=driver.getTitle();	
	System.out.println(pageTitle2);
}





public static  void webWait(WebElement e) {
WebDriverWait wait =new WebDriverWait(driver, 500);
wait.until(ExpectedConditions.elementToBeClickable(e));
}

public static  void webWaitframe(WebElement e) {
WebDriverWait wait =new WebDriverWait(driver, 500);
wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(e));
}




@AfterClass
public static void tearDown() {
driver.quit();
}

}
