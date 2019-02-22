package com.web.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
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

@Parameters({ "browser" })
@BeforeClass	
public static void setUp(String browser){

driver.manage().window().maximize();

try {
	if (browser.equalsIgnoreCase("Firefox")) {
		driver = new FirefoxDriver();
	} else if (browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	} else if (browser.equalsIgnoreCase("IE")) {
		driver = new InternetExplorerDriver();
	}

} catch (WebDriverException e) {
	System.out.println(e.getMessage());
}


}

@Test(priority=0)
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
public static void createAcc() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement element3 = driver.findElement(By.className("LC20lb"));
	element3.click();
	String pageTitle3=driver.getTitle();	
	System.out.println(pageTitle3);
	
//js.executeScript("alert('Welcome To SoftwareTestingMaterial');");
/*String sText1=js.executeScript("return document.domain;").toString();
System.out.println(sText1);
String sText2=js.executeScript("return document.title;").toString();
System.out.println(sText2);*/

//js.executeScript("window.scrollBy(0,500);");

js.executeScript("window.scrollBy(0,document.body.scrollHeight);");
}

public static  void webWait(WebElement e) {
WebDriverWait wait =new WebDriverWait(driver, 500);
wait.until(ExpectedConditions.elementToBeClickable(e));
}


public static void  getScreenShot() {
    try {
          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          //The below method will save the screen shot in destination directory with name "screenshot.png"
           FileHandler.copy(scrFile, new File("D:/reports/screenshot.png"));
       } catch (IOException e) {
           e.printStackTrace();
          }
}

@AfterClass
public static void tearDown() {
	//driver.quit();
}

}
