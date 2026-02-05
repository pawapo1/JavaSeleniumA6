package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
@FindBy(linkText = "Register") private WebElement registerLink;
@FindBy(linkText = "Log in") private WebElement loginLink;
@FindBy(xpath="//span[text()='Shopping cart']") private WebElement shoppingcartLink;
@FindBy(linkText="Wishlist") private WebElement wishlistLink;
@FindBy(partialLinkText="BOOKS") private WebElement booksLink;
@FindBy(partialLinkText="COMPUTERS") private WebElement computerLink;
@FindBy(partialLinkText="ELECTRONICS") private WebElement ELECTRONICSLink;
@FindBy(linkText="Log out") private WebElement logoutlink;

//Initialization
public BasePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
//utilization

public WebElement getRegisterLink() {
	return registerLink;
}



public WebElement getLoginLink() {
	return loginLink;
}

public WebElement getShoppingcartLink() {
	return shoppingcartLink;
}

public WebElement getWishlistLink() {
	return wishlistLink;
}

public WebElement getBooksLink() {
	return booksLink;
}

public WebElement getComputerLink() {
	return computerLink;
}

public WebElement getELECTRONICSLink() {
	return ELECTRONICSLink;
}
	public WebElement getLogoutlink() {
		return logoutlink;
	}
}


