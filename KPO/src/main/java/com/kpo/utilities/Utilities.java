/**
 * 
 */
/**
 * @author mvprawin
 *
 */
package com.kpo.utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.junit.*;
//import org.testng.annotations.*;


public class Utilities {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	public static String propertiesfile = "G:/Workspace/NewEclipse-Workspace/KPO/src/test/resources/config/config.properties";
	public static String baseUrl;
	
public static void browserSetUp(String Browser) throws IOException {
	/*try {*/	
	if (Browser.equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", getProperty(propertiesfile,"driverPath"));
		driver = new FirefoxDriver();
		System.out.println("FireFox invoked");
		
	}
	else if(Browser.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", getProperty(propertiesfile,"driverPath"));
		driver = new ChromeDriver();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> preferences = new Hashtable<String, Object>();
		options.setExperimentalOption("prefs", preferences);
		preferences.put("plugins.plugins_disabled", new String[] {
		    "Chrome PDF Viewer"
		});
		preferences.put("plugins.always_open_pdf_externally", true);
		preferences.put("download.default_directory",Utilities.getProperty(Utilities.propertiesfile,"tempFolder"));
		driver =  new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.manage().window().maximize(); 
		
	}
	else if(Browser.equals("IE")) {
		driver =new InternetExplorerDriver();
	}
	else {
		System.out.println("Given Browsername is not valid");
	}
	driver.manage().window().maximize();
	
	baseUrl= getProperty(propertiesfile,"url");
	System.out.println("Application Url:"+ baseUrl);
	
	driver.get(baseUrl);
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
/*	}
	catch(Exception e) {
		System.out.println("Browser display failed");
	}*/
}
	
	

public static String getProperty(String file, String prop_value) throws IOException {
	String value;
	Properties p=new Properties();
	FileInputStream f=new FileInputStream(file);
	p.load(f);
	value=p.getProperty(prop_value);
	return value;
	
}

	
public static void waitUntilElementVisible(WebElement element) {
	wait = new WebDriverWait(driver,200);
	wait.until(ExpectedConditions.visibilityOf(element));
}

public static void waitUntilElementClicable(WebElement element) {
	wait = new WebDriverWait(driver,200);
	wait.until(ExpectedConditions.elementToBeClickable(element));
	}

public static void mouseHover(WebElement element) {
	action = new Actions(driver);
	action.moveToElement(element).click().build().perform();
		
}

public static boolean isAlertPresent(){
    try {
    	driver.switchTo().alert();
        return true; 
    } catch (NoAlertPresentException Ex) {
    	return false; 
    }

}


public static void clickPopup() {
	Alert alert =driver.switchTo().alert();
	alert.accept();
	
}

	
}