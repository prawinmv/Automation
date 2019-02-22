package com.kpo.pagesRepository;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;

import com.kpo.utilities.Utilities;
public class Alerts {
	final WebDriver driver;
	
@FindBy(how=How.CSS, using="#authDiv>p>strong") WebElement question;
@FindBy(how=How.ID, using="verifyAnswer") WebElement answerTxt;
@FindBy(how=How.ID, using="VerifyButton") WebElement verify_btn;



public String alpageTitle() {
	return Utilities.driver.getTitle();
}

public String questionTxt() {
	return question.getText();
}


public void setAnswer(String answer) {
	answerTxt.sendKeys(answer);
}


public void clickVerifybtn() {
	verify_btn.click();
}

public Alerts(WebDriver driver) {
	this.driver = driver;
}
}
