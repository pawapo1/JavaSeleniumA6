package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class ShoppingCartPage {
	//declaration
//@FindBy(xpath="//a[text()='Smartphone']/../..//input[@name='removefromcart']")
@FindBy(xpath = "(//a[text()='Smartphone'])/../..//input[@name='removefromcart']") 

private WebElement smartPhoneCartItem;
@FindBy(name="updatecart") private WebElement updateCartButton;
@FindBy(name="continueshopping") private WebElement continueShoppingButton;
@FindBy(id="termsofservice") private WebElement termsofserviceCheckbox;
@FindBy(id="checkout") private WebElement checkoutButton;
//Initialization
public ShoppingCartPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	//Utilization
	
}
public WebElement getSmartPhoneCartItem() {
	return smartPhoneCartItem;
}
public WebElement getUpdateCartButton() {
	return updateCartButton;
}
public WebElement getContinueShoppingButton() {
	return continueShoppingButton;
}
public WebElement getTermsofserviceCheckbox() {
	return termsofserviceCheckbox;
}
public WebElement getCheckoutButton() {
	return checkoutButton;
}
//operational method/business logic
public void removeSmartPhoneMethod() {
	smartPhoneCartItem.click();
	updateCartButton.click();
	
}



}
