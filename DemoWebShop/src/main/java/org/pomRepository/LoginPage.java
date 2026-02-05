package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declaration
	@FindBy(linkText="Log in") private WebElement loginlink;
	@FindBy(id="Email") private WebElement loginemailTB;
	@FindBy(id="Password") private WebElement loginpasswordTB;
	@FindBy(id="RememberMe") private WebElement remembermecheckbox;
	@FindBy(linkText="Forgot password") private WebElement forgotpasswordtextbox;
	@FindBy(xpath="//input[@value='Log in']") private WebElement loginbutton;

	
	//Initialization
	public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	//utilization
	
}
	public WebElement getloginlink() {
		return loginlink;
	}

	public WebElement getLoginemailTB() {
		return loginemailTB;
	}


	public WebElement getLoginpasswordTB() {
		return loginpasswordTB;
	}


	public WebElement getRemembermecheckbox() {
		return remembermecheckbox;
	}


	public WebElement getForgotpasswordtextbox() {
		return forgotpasswordtextbox;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}}
