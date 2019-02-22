package com.kpo.pagesRepository;

import com.kpo.utilities.Utilities;
import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.pagefactory.*;

public class Login {
	final WebDriver driver;

@FindBy(how=How.NAME,using="loginName") WebElement username_txtbx;
@FindBy(how=How.NAME,using="password") WebElement password_txtbx;
@FindBy(how=How.ID,using="login-button") WebElement submit_btn;


public void setUsername(String username) {
	username_txtbx.sendKeys(username);
}

public void setPasswd(String password) {
	password_txtbx.sendKeys(password);
}

public void loginSubmit() {
	submit_btn.click();
}

public String lgpageTitle() {
	return Utilities.driver.getTitle();
}

public Login(WebDriver driver){

this.driver = driver;

}

}
