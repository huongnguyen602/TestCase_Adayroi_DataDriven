package Demo.TestCase_Adayroi_DataDriven.appModule;


import Demo.TestCase_Adayroi_DataDriven.PageObject.HomePage;
import Demo.TestCase_Adayroi_DataDriven.PageObject.SignInPage;
import Demo.TestCase_Adayroi_DataDriven.Utility.Constant;
import Demo.TestCase_Adayroi_DataDriven.Utility.ExcelUtils;
import Demo.TestCase_Adayroi_DataDriven.Utility.Log;

public class SignInPage_Action {
	public static void Execute(int iTestCaseRow) throws Exception {
		HomePage.clickToSignIn();
		String userName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_UserName);
		SignInPage.txtEmail().sendKeys(userName);
		String password = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Password);
		SignInPage.txtPassword().sendKeys(password);
		SignInPage.btnSignInSubmit().click();
		Log.info("User submits to login account ");
		
	}
}
