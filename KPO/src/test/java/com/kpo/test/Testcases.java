/**
 * 
 */
/**
 * @author mvprawin
 *
 */
package com.kpo.test;

import com.kpo.methodsLibrary.*;
import com.kpo.pagesRepository.*;
import com.kpo.utilities.*;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.*;
//import org.junit.*;

public class Testcases extends TestBase{
	static Utilities utilities =new Utilities();
	static LibMethods lib =new LibMethods();
			
@Test(priority = 0)
public void loginTest() throws Exception {
	Login lg=PageFactory.initElements(Utilities.driver,Login.class);
	try {
		Assert.assertEquals(lg.lgpageTitle(), "Revenue Cycle Management Solutions | Waystar");
	lg.setUsername(Utilities.getProperty(Utilities.propertiesfile,"username"));
	lg.setPasswd(Utilities.getProperty(Utilities.propertiesfile,"password"));
	lg.loginSubmit();
	System.out.println(" Login Successfull");
	}
	catch (Exception e) {
		System.out.println("Login Failed");
	}
}

@Test(priority =1)
public void alertPageTest() throws Exception {
	Alerts al = PageFactory.initElements(Utilities.driver,Alerts.class );
	 
	 if(al.alpageTitle().contains("Authentication")) {
	 
			try {
				Assert.assertEquals(al.alpageTitle(), "Additional Authentication Required");

	
					if (al.questionTxt().contains("job")) {
						al.setAnswer(Utilities.getProperty(Utilities.propertiesfile,"answer1"));
					}
					else if(al.questionTxt().contains("pet")) {
						al.setAnswer(Utilities.getProperty(Utilities.propertiesfile,"answer2"));
					}
					else {
						System.out.println("Question not known");
					}
					
					al.clickVerifybtn();	
			}	
	 
		catch (Exception e) {
			System.out.println("Alerts Page display error");
		}
	 }
	 else {
		 System.out.println("Alerts page not displayed hence this case was skipped");
	 }
	

}

@Test(priority=2)
public void dropDownSelect() throws InterruptedException {
		lib.dateSelection();
		lib.viewPaymentDetails();	
}




	
}