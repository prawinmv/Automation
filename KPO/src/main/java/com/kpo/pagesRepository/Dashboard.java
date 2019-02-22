package com.kpo.pagesRepository;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import com.kpo.utilities.Utilities;

public class Dashboard{
	
	final WebDriver driver;

	@FindBy (how=How.CSS,using="select") public WebElement location_dpdwn ;	
	@FindBys({@FindBy(how=How.CSS, using="select"),@FindBy(how=How.TAG_NAME, using="option")}) public List<WebElement> dpdwnCount;	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'Claims Processing')]") public WebElement claims;	
	@FindBy(how=How.LINK_TEXT, using="Remits") public WebElement remits;
	@FindBy(how=How.LINK_TEXT, using="Payments") public WebElement payments;
	@FindBy(id="txtAmount") public WebElement Amount;
	
	@FindBy(name="ct104") public WebElement fromDate;
	@FindBy(xpath="//*[@id='dp1542862609163'][@name='ct106']") public WebElement toDate;

	
	public String dbPageTitle() {
		return Utilities.driver.getTitle();
	}
	
	public void fromDateSelect(String dt) {
		fromDate.click();
		fromDate.clear();
		fromDate.sendKeys(dt);
	}
	
	
	public void toDateSelect(String dt) {
		toDate.clear();
		toDate.click();
		toDate.sendKeys(dt);
	}

	public Dashboard(WebDriver driver){

		this.driver = driver;

		}
	
}
