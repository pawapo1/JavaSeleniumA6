package org.GenericLib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectUtility {
/**
 * to select an option by its visible text
 */
	public void SelectByVisibleTextMethod(WebElement DropdownElement,String visibleText) {
		Select select = new Select(DropdownElement);
		select.selectByVisibleText(visibleText);
	}
}
