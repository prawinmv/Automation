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

public class Yahoo {
	public static WebDriver driver;

@BeforeClass	
public static void setUp(){

System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver.exe");
driver = new ChromeDriver();
driver.manage().window().maximize();

}


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


@Test(priority=1)
public static void toolTip1() throws InterruptedException {
	driver.get("https://docs.seleniumhq.org/");
	WebElement element =driver.findElement(By.xpath("//a[@title='Return to Selenium home page']"));
	webWait(element);
	
	String text = element.getAttribute("title");
	System.out.println(text);
}


@Test(priority=2)
public static void toolTip2() throws InterruptedException {
	driver.get("https://jqueryui.com/tooltip/");
	
	WebElement fram= driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
	
	webWaitframe(fram);
	
	WebElement element =driver.findElement(By.xpath("//input[@id='age']"));
	webWait(element);
	
	Actions action =new Actions(driver);
	action.moveToElement(element).build().perform();
	WebElement toolTipElement = driver.findElement(By.cssSelector(".ui-tooltip"));
	String toolTipText = toolTipElement.getText();
	
	
	//String text = element.getAttribute("title");
	System.out.println(toolTipText);
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
