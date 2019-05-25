package Demo.TestCase_Adayroi_DataDriven.AutomationFramework;

import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.TestCase_Adayroi_DataDriven.PageObject.BaseClass;
import Demo.TestCase_Adayroi_DataDriven.PageObject.PaymentDetailsPage;
import Demo.TestCase_Adayroi_DataDriven.PageObject.SearchPage;
import Demo.TestCase_Adayroi_DataDriven.Utility.Constant;
import Demo.TestCase_Adayroi_DataDriven.Utility.ExcelUtils;
import Demo.TestCase_Adayroi_DataDriven.Utility.Log;
import Demo.TestCase_Adayroi_DataDriven.Utility.Utils;
import Demo.TestCase_Adayroi_DataDriven.appModule.CheckOutPage_Action;
import Demo.TestCase_Adayroi_DataDriven.appModule.PaymentDetailsPage_Action;
import Demo.TestCase_Adayroi_DataDriven.appModule.ProductListingPage_Action;
import Demo.TestCase_Adayroi_DataDriven.appModule.SearchPage_Action;
import Demo.TestCase_Adayroi_DataDriven.appModule.SignInPage_Action;

public class TestNG_Framework {
	public WebDriver driver;
	public WebDriverWait wait;
	private String sTestCaseName;
	private int iTestCaseRow;

	@BeforeMethod
	public void beforeMethod() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		Log.info(" Excel sheet opened");
		sTestCaseName = this.toString();
		sTestCaseName = Utils.getTestCaseName(this.toString());

		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "sheet1");
		System.setProperty("webdriver.chrome.driver",Constant.Path_Driver);
		iTestCaseRow = ExcelUtils.getRowContains(sTestCaseName, Constant.Col_TestCaseName);
		driver = Utils.OpenBrowser(iTestCaseRow);
		new BaseClass(driver);
		driver.manage().window().maximize();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-infobars");
	}

	@Test
	public void main() throws Exception {
//		String Email = ExcelUtils.getCellData(1, 1);
//		String Password = ExcelUtils.getCellData(1, 2);
//		HomePage_Action.Execute(driver);
		// SignInPage_Action.Execute(driver, "0981284843", "123456?a");
		SignInPage_Action.Execute(iTestCaseRow);
		if (BaseClass.bResult == true) {
			// If the value of boolean variable is True, then your test is complete pass and
			// do this
			ExcelUtils.setCellData("Pass", iTestCaseRow, Constant.Col_Result);
		} else {
			ExcelUtils.setCellData("Fail", iTestCaseRow, Constant.Col_Result);
			throw new Exception("Test Case Failed because of Verification");
		}
		Thread.sleep(3000);
		SearchPage_Action.Execute(driver);
		ProductListingPage_Action.Execute(iTestCaseRow);
		CheckOutPage_Action.Execute(iTestCaseRow);
		
	}

//	@AfterMethod
//	public void afterMethod() {
//		driver.quit();
//	}

}
