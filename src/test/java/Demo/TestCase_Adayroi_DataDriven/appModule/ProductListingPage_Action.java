package Demo.TestCase_Adayroi_DataDriven.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.TestCase_Adayroi_DataDriven.PageObject.ProductListingPage;
import Demo.TestCase_Adayroi_DataDriven.Utility.Constant;
import Demo.TestCase_Adayroi_DataDriven.Utility.ExcelUtils;

public class ProductListingPage_Action {
	static WebDriverWait wait;
	static WebDriver driver;

	public static void Execute(int iTestCaseRow) throws Exception {
		// SearchPage_Action.Execute(driver);
		String sProductName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_ProductName);
		for (int i = 0; i < ProductListingPage.productList().size(); i++) {
			if (ProductListingPage.productList().get(i).getText().contains(sProductName)) {
				ProductListingPage.productList().get(i).click();
				break;
			}
		}
		
//		for (String handle1 : driver.getWindowHandles()) {
//			driver.switchTo().window(handle1);
//		}
		//wait.until(ExpectedConditions.visibilityOf(ProductListingPage.btnAddToCart())).click();
		ProductListingPage.btnAddToCart().click();
	}

}
