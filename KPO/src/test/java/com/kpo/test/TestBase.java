/**
 * 
 */
/**
 * @author mvprawin
 *
 */
package com.kpo.test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.kpo.methodsLibrary.*;
import com.kpo.pagesRepository.*;
import com.kpo.utilities.*;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;
//import org.junit.*;

public class TestBase{
	static Utilities utilities =new Utilities();	
			
	
@BeforeClass
public static void invokeBrowser() throws IOException {	
	Utilities.browserSetUp(Utilities.getProperty(Utilities.propertiesfile,"Browser"));
	System.out.println("Testcase Execution started");
	
}


@AfterClass
public static void terminateBrowser() {
System.out.println("Testcase Execution completed");
	Utilities.driver.quit();
}
	




	
}