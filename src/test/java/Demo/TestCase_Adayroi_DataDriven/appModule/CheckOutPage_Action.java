package Demo.TestCase_Adayroi_DataDriven.appModule;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.TestCase_Adayroi_DataDriven.PageObject.CheckOutPage;
import Demo.TestCase_Adayroi_DataDriven.PageObject.ProductListingPage;
import Demo.TestCase_Adayroi_DataDriven.Utility.Constant;
import Demo.TestCase_Adayroi_DataDriven.Utility.ExcelUtils;

public class CheckOutPage_Action {
	static WebDriverWait wait;
	public static void Execute(int iTestCaseRow) throws Exception {
		CheckOutPage.btnViewCart().click();
		CheckOutPage.btnCartSubmit().click();
//		String sRemovedProductName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_RemovedProductName);
//		for (int i = 0; i < ProductListingPage.productList().size(); i++) {
//			System.out.print("sRemovedProductName: " +sRemovedProductName);
//			if (CheckOutPage.selectedProductList().get(i).getText().contains(sRemovedProductName)) {
//				CheckOutPage.selectedProductList().get(i).click();
//				CheckOutPage.btnRemoveProduct().click();
//				break;
//			}
//		}
	}
}
