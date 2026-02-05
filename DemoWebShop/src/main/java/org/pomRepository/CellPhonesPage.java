package org.pomRepository;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CellPhonesPage {
@FindBy(xpath = "(//a[text()='Smartphone'])/../..//input[@value='Add to cart']") 
private WebElement cellphoneAddtoCartButton;
@FindBy(xpath = "//*[contains(text(),'The product has been added to your')]")
private WebElement ProductAddedtoCartMsg;

//Initialization
	public CellPhonesPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
	}
//utilization
	public WebElement getCellphoneAddtoCartButton() {
		return cellphoneAddtoCartButton;
	}
	public WebElement getProductAddedtoCartMsg() {
		return ProductAddedtoCartMsg;
	}
	
}
