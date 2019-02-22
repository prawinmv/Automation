/**
 * 
 */
/**
 \* @author mvprawin
 *
 */
package com.kpo.methodsLibrary;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.kpo.utilities.*;
import com.kpo.pagesRepository.*;

public class LibMethods{

	static int i;
	static String dateNow;
	static Dashboard db;
	//static Utilities utilities =new Utilities();


public void viewPaymentDetails() {
	db= PageFactory.initElements(Utilities.driver,Dashboard.class);
	
	Utilities.waitUntilElementClicable(db.location_dpdwn);
	System.out.println("DropDown size "+db.dpdwnCount.size());
	for(i=0;i<db.dpdwnCount.size();i++) {
		String practLocation=db.dpdwnCount.get(i).getText();
		System.out.println(practLocation);
		
		db.dpdwnCount.get(i).click();
		Utilities.mouseHover(db.claims);
		
		Utilities.waitUntilElementVisible(db.claims);
		db.claims.click();
		System.out.println("Claims link clicked");
		
		Utilities.waitUntilElementVisible(db.remits);
		db.remits.click();	
		System.out.println("Remits link clicked");
		
		Utilities.waitUntilElementVisible(db.payments);		
		db.payments.click();
		System.out.println("payments link clicked");
		
	}
	
}
	
	public void dateSelection() {
		Calendar now = Calendar.getInstance();
	    now.add(Calendar.DATE,-1); // Previous date = -1
	    now.add(Calendar.MONTH,0); // Current month = 0
	    now.add(Calendar.YEAR,0); // Current year = 0
	    SimpleDateFormat 
	    formatter= new SimpleDateFormat("MM/dd/yyyy");
	    dateNow = formatter.format(now.getTime());
		System.out.println(dateNow);
	
	}



}