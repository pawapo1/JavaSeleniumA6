package org.testPackage;

import org.GenericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.GenericLib.MyListener.class)

public class TC_RemoveProductFromCart_002_Test extends BaseTest {
	@Test
public void removeProductFromCartMethod() {
	BasePage bp = new BasePage(driver);
	bp.getELECTRONICSLink().click();
	
	ElectronicsPage ep = new ElectronicsPage(driver);
	ep.getCellPhonesLink().click();
	
	 CellPhonesPage cpp = new CellPhonesPage(driver);
	 cpp.getCellphoneAddtoCartButton().click();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals
	(cpp.getProductAddedtoCartMsg().isDisplayed(),true,"Product is not added to cart!!");
    bp.getShoppingcartLink().click();
    ShoppingCartPage scp = new ShoppingCartPage(driver);
    scp.removeSmartPhoneMethod();
    try {
    	if(scp.getSmartPhoneCartItem().isDisplayed()) {
    		Reporter.log("product is not remove from cart !!",true);
    	}
    }
    catch(Exception e) {
    	Reporter.log("product is removed from cart !!",true);
}
    sa.assertAll();
    }}
