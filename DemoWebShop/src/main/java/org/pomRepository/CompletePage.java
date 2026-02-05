package org.pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompletePage {
@FindBy(xpath ="//strong[text()='Your order has been sucessfully processed']")
private WebElement orderPlaceMsg;
//initialization
public CompletePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
//utilization
public WebElement getOrderPlaceMsg() {
	return orderPlaceMsg;
}

}
