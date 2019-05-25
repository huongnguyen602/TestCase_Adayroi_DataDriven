package Demo.TestCase_Adayroi_DataDriven.PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Demo.TestCase_Adayroi_DataDriven.Utility.Log;

public class SignInPage extends BaseClass {
	private static WebElement element = null;

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement txtEmail() throws Exception {
		try {
			element = driver.findElement(By.id("j_username"));
		} catch (Exception e) {
			Log.info("Please, Enter correct user Name");
			throw (e);
		}
		return element;
	}

	public static WebElement txtPassword() throws Exception {

		try {
			element = driver.findElement(By.id("j_password"));
		} catch (Exception e) {
			Log.info("Please, Enter correct password");
			throw (e);
		}
		return element;
	}

	public static WebElement btnSignInSubmit() throws Exception {
		try {
			element = driver.findElement(By.xpath("//*[@class=\"btn btn-primary btn-block js-login-btn\"]"));
		} catch (Exception e) {
			Log.info("Signin button submit is not found");
			throw (e);
		}
		return element;
	}
}
