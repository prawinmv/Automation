package com.web.app;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.junit.*;

public class Webtable {
	


@Test(expected = NoSuchElementException.class)
public void homePage() {
 WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
/*	driver.get("http://demo.guru99.com/test/web-table-element.php");	
	String pageTitle1=driver.getTitle();
	System.out.println(pageTitle1);
	WebElement btable = driver.findElement(By.tagName("table"));	
	List<WebElement> row = btable.findElements(By.tagName("tr"));
	System.out.println("Total no. of rows"+ row.size());	
	for (int i=0; i< row.size();i++) {
		List<WebElement> col = row.get(i).findElements(By.tagName("th"));		
		for (int j=0; j< col.size();j++) {			
			String value = col.get(j).getText();
			//if(value.contains("Bank")) {
			System.out.println("Text value: "+value + " & Row no.:="+ i +" & Col.no:="+j);
		//}
		}
	}*/
	
	
	driver.get("http://demo.automationtesting.in/WebTable.html");
	
	//List<WebElement> value = driver.findElements(By.cssSelector("body > section > div:nth-child(1) > div > div.col-xs-12.myGrid.ui-grid.ng-isolate-scope.grid1550127670491"));
	List<WebElement> value = driver.findElements(By.xpath("//div[@class='grid-cell-contents ng-binding ng-scope']"));
	
	System.out.println(value.size());
	
	
	
	
	
	
	
	
	
	
	
}
}
		
		
	
	
	
	
	
	