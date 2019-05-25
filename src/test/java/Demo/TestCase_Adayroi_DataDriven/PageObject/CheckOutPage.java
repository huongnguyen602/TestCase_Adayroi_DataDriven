package Demo.TestCase_Adayroi_DataDriven.PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Demo.TestCase_Adayroi_DataDriven.Utility.Log;

public class CheckOutPage extends BaseClass {
	private static WebElement element = null;
	private static List<WebElement> selectedListProduct;

	public CheckOutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public static WebElement btnViewCart() throws Exception {
		try {
			Log.info("View cart button is found");
			Thread.sleep(3000);
			element = driver
					.findElement(By.xpath("//*[@class = 'mini-cart-link js-mini-cart-link']"));
		} catch (Exception e) {
			Log.error("View cart button is not found!");
			throw (e);
		}
		return element;
	}
	
	public static WebElement btnCartSubmit() throws Exception {
		try {
			Log.info("Cart submit button is found");
			Thread.sleep(3000);
			element = driver
					.findElement(By.xpath("//div[@class = 'cart-submit']"));
		} catch (Exception e) {
			Log.error("Cart submit button is not found!");
			throw (e);
		}
		return element;
	}
	
//	public static List<WebElement> selectedProductList() throws Exception {
//		try {
//			Log.info("Selected Product List is found");
//			selectedListProduct = driver.findElements(By.xpath("//*[@class = \"cart-page-product__list\"]/div"));
//		} catch (Exception e) {
//			Log.error("Selected Product List is not found");
//			throw (e);
//		}
//		System.out.print("\n listProduct.size: " + selectedListProduct.size());
//		return (List<WebElement>) selectedListProduct;
//	}
//	
//	public static WebElement btnRemoveProduct() throws Exception {
//		try {
//			Log.info("Remove Item button is found");
//			element = driver
//					.findElement(By.xpath("//*[@class = 'cart-page-product__list-item-remove js-remove-entry-button']"));
//		} catch (Exception e) {
//			Log.error("Remove Item button is not found!");
//			throw (e);
//		}
//		return element;
//	}
}
