package org.base;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogin extends BaseClass {
	public FbLogin() {
	PageFactory.initElements(driver, this);	
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement pass;
	
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement logbtn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLogbtn() {
		return logbtn;
	}
}
