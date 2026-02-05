package org.pomRepository;
import org.GenericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
//declaration 
@FindBy(id="BillingNewAddress_Company") private WebElement NameTB;
@FindBy(id="BillingNewAddress_CountryId") private WebElement billingaddresscountry00;
@FindBy(id="billing-address-select") private WebElement billingNewaddress00;
@FindBy(id="BillingNewAddress_City") private WebElement cityTB;
@FindBy(id="BillingNewAddress_Address1") private WebElement address1TB;
@FindBy(id="BillingNewAddress_Address2") private WebElement address2TB;
@FindBy(id="BillingNewAddress_ZipPostalCode") private WebElement pincodeTB;
@FindBy(id="BillingNewAddress_PhoneNumber") private WebElement phonenumberTB;
@FindBy(id="BillingNewAddress_FaxNumber") private WebElement faxNumberTB;
@FindBy(xpath="//input[@onclick='Billing.save()']")
private WebElement billingaddresscontinuebutton;
//Shipping address page webelement
//@FindBy(xpath="//h2[text()='Shipping address']") private WebElement shippingaddress00;
@FindBy(id="shipping-address-select") private WebElement shippingaddress00;
@FindBy(xpath="//input[@onclick='Shipping.save()']")
private WebElement shippingaddresscontinuebutton;
@FindBy(xpath="//input[@onclick='ShippingMethod.save()']")
private WebElement shippingmethodContinueMethod;
@FindBy(xpath="//input[@onclick='PaymentMethod.save()']")
private WebElement paymentMethodContinueButton;
@FindBy(xpath="//input[@onclick='PaymentInfo.save()']")
private WebElement PaymentInfoContinueButton;
@FindBy(xpath="//input[@onclick='ConfirmOrder.save()']")
private WebElement ConfirmOrderContinueButton;

//initialization
public CheckoutPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
public WebElement getNameTB() {
	return NameTB;
}
public WebElement getBillingaddresscountry00() {
	return billingaddresscountry00;
}
public WebElement getCityTB() {
	return cityTB;
}
public WebElement getAddress1TB() {
	return address1TB;
}
public WebElement getAddress2TB() {
	return address2TB;
}
public WebElement getPincodeTB() {
	return pincodeTB;
}
public WebElement getPhonenumberTB() {
	return phonenumberTB;
}
public WebElement getFaxNumberTB() {
	return faxNumberTB;
}
public WebElement getBillingaddresscontinuebutton() {
	return billingaddresscontinuebutton;
}
public WebElement getShippingaddress00() {
	return shippingaddress00;
}
public WebElement getShippingaddresscontinuebutton() {
	return shippingaddresscontinuebutton;
}
public WebElement getShippingmethodContinueMethod() {
	return shippingmethodContinueMethod;
}
public WebElement getPaymentMethodContinueButton() {
	return paymentMethodContinueButton;
}
public WebElement getPaymentInfoContinueButton() {
	return PaymentInfoContinueButton;
}
public WebElement getConfirmOrderContinueButton() {
	return ConfirmOrderContinueButton;
}
public WebElement getbillingNewaddress00() {
	return billingNewaddress00;
}
//operational method /business logic
public void buyproduct(String city,String address1,String pincode,String phonenumber) throws InterruptedException {
	SelectUtility su = new SelectUtility();
	try {
		if(billingNewaddress00.isDisplayed()) {
			su.SelectByVisibleTextMethod(billingNewaddress00,"New Address" );
		}}
		catch(Exception e) {
			su.SelectByVisibleTextMethod(billingaddresscountry00, "India");
		}
  su.SelectByVisibleTextMethod(billingaddresscountry00, "India");
  Thread.sleep(2000);
	cityTB.sendKeys(city);
	address1TB.sendKeys(address1);
	pincodeTB.sendKeys(pincode);
	phonenumberTB.sendKeys(phonenumber);
	billingaddresscontinuebutton.click();
	shippingaddresscontinuebutton.click();
	shippingmethodContinueMethod.click();
	paymentMethodContinueButton.click();
	PaymentInfoContinueButton.click();
	ConfirmOrderContinueButton.click();
	}
}
