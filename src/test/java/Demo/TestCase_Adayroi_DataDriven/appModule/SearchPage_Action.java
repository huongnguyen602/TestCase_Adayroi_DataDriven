package Demo.TestCase_Adayroi_DataDriven.appModule;

import org.openqa.selenium.WebDriver;

import Demo.TestCase_Adayroi_DataDriven.PageObject.SearchPage;

public class SearchPage_Action {
	
	public static void Execute(WebDriver driver) throws Exception {
		System.out.print("\n test search");
		SearchPage.txtSearch().sendKeys("Ipad");
		SearchPage.btnSearch().click();
	}
}
