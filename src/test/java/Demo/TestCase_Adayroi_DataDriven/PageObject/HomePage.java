package Demo.TestCase_Adayroi_DataDriven.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Demo.TestCase_Adayroi_DataDriven.Utility.Log;
import Demo.TestCase_Adayroi_DataDriven.Utility.Utils;

public class HomePage extends BaseClass {
	private static WebElement element = null;

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement lnkAccount() throws Exception {
		try {
			Log.info("Move to Login Account link");
			element = driver.findElement(By.xpath("//*[@class = 'header-username']"));
		} catch (Exception e) {
			Log.error("Login Account link is not found!");
			throw (e);
		}
		return element;
	}

	public static WebElement btnSignIn() throws Exception {
		try {
			Log.info("Click to Signin button to login account");
			element = driver.findElement(By.xpath("//div[@class ='row']/div[2]/button/div"));
		} catch (Exception e) {
			Log.error("Signin button is not found!");
			throw (e);
		}
		return element;
	}
	
	public static void clickToSignIn() throws Exception {
		Utils.mouseHoverAction(HomePage.lnkAccount());
		HomePage.btnSignIn().click();
	}
}
