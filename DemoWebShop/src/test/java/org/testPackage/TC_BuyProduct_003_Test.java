package org.testPackage;
import org.GenericLib.BaseTest;
import org.GenericLib.Flib;
import org.pomRepository.BasePage;
import org.pomRepository.CellPhonesPage;
import org.pomRepository.CheckoutPage;
import org.pomRepository.CompletePage;
import org.pomRepository.ElectronicsPage;
import org.pomRepository.ShoppingCartPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Listeners(org.GenericLib.MyListener.class)

public class TC_BuyProduct_003_Test extends BaseTest {
	@Test
	public void buyproductmethod() throws InterruptedException {
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
     scp.getSmartPhoneCartItem().click();
     scp.getTermsofserviceCheckbox().click();
     scp.getCheckoutButton().click();
     
     String city = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 0);
     String address1 = Flib.getWorkbookCellValue(EXCEL_PATH_TEST,"buyproductcreds", 1, 1);
     String pincode = Flib.getnumericcellvaluemethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 2);
    String contact = Flib.getnumericcellvaluemethod(EXCEL_PATH_TEST,"buyproductcreds", 1, 3);
   int rn = Flib.generateRandomNo();
   String phonenumber = contact+rn;
       CheckoutPage cop = new CheckoutPage(driver);
       cop.buyproduct(city, address1, pincode, phonenumber);
       CompletePage cp = new CompletePage(driver);
       cp.getOrderPlaceMsg();
    sa.assertEquals(cp.getOrderPlaceMsg().isDisplayed(),true,"Order is not processed!!");
    sa.assertAll();
	}}
