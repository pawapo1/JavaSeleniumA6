package org.testPackage;

import org.GenericLib.BaseTest;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.ElectronicsPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


@Listeners(org.GenericLib.MyListener.class)
public class TC_AddToCart_001_Test extends BaseTest{
@Test
public void addToCartMethod() {
	
	BasePage bp = new BasePage(driver);
	bp.getELECTRONICSLink().click();
	
	ElectronicsPage ep = new ElectronicsPage(driver);
	ep.getCellPhonesLink().click();
	
	 CellPhonesPage cpp = new CellPhonesPage(driver);
	 cpp.getCellphoneAddtoCartButton().click();
	SoftAssert sa = new SoftAssert();
	sa.assertEquals
	(cpp.getProductAddedtoCartMsg().isDisplayed(),true,"Product is not added to cart!!");
	sa.assertAll();
}
}
