package Demo.TestCase_Adayroi_DataDriven.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Demo.TestCase_Adayroi_DataDriven.PageObject.HomePage;

public class HomePage_Action {
	public static void Execute(WebDriver driver) throws Exception {
		Actions action = new Actions(driver);
		action.moveToElement(HomePage.lnkAccount()).build().perform();
		HomePage.btnSignIn().click();
	}

}
