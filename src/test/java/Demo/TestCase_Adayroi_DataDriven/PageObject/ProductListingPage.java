package Demo.TestCase_Adayroi_DataDriven.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import Demo.TestCase_Adayroi_DataDriven.Utility.Log;

public class ProductListingPage extends BaseClass {
	private static WebElement element = null;
	private static List<WebElement> listProduct;

	public ProductListingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static List<WebElement> productList() throws Exception {
		try {
			Log.info("Product List is found");
			listProduct = driver.findElements(By.xpath("//div[@class ='product-list__container']/div/div"));
		} catch (Exception e) {
			Log.error("Product List is not found");
			throw (e);
		}
		return (List<WebElement>) listProduct;
	}

	public static WebElement btnAddToCart() throws Exception {
		try {
			Log.info("Add To Cart button is found"); 
			element = driver.findElement(By.xpath("//*[@id='addToCartButton']/span"));
		} catch (Exception e) {
			Log.info("Add To Cart button is not found");
			throw (e);
		}
		return element;
	}
}
