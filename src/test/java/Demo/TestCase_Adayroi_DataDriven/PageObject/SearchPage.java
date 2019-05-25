package Demo.TestCase_Adayroi_DataDriven.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.TestCase_Adayroi_DataDriven.Utility.Log;

public class SearchPage extends BaseClass {
	private static WebElement element = null;
	public static WebDriverWait wait;
	
	public SearchPage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver,30);
	}

	public static WebElement txtSearch() throws Exception {
		try {
			Log.info("Enter keyword to search");
			element = driver.findElement(By.xpath("//input[@class ='form-control js-site-search-input  ui-autocomplete-input']"));
		} catch (Exception e) {
			Log.error("Not found!");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btnSearch() throws Exception {
		try {
			Log.info("Search button is found");
			element = driver.findElement(By.xpath("//*[@class=\"polish-version-icon-search\" ]"));
		} catch (Exception e) {
			Log.info("Search button is not found !!");
			throw (e);
		}
		return element;
	}
}
