package Demo.TestCase_Adayroi_DataDriven.Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Utils {
	public static WebDriver driver = null;

	public static WebDriver OpenBrowser(int iTestCaseRow) throws Exception {
		String sBrowserName;
		try {
			sBrowserName = ExcelUtils.getCellData(iTestCaseRow, Constant.Col_Browser);

			if (sBrowserName.equals("Mozilla")) {
				System.setProperty("webdriver.gecko.driver", "C:\\workspace\\b4u_auto\\drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				Log.info("New driver instantiated");
			} else if (sBrowserName.equals("Chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\workspace\\b4u_auto\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Log.info("Implicit wait applied on the driver for 10 seconds");
			driver.get(Constant.URL);
			Log.info("Web application launched successfully");

		} catch (Exception e) {
			Log.error("Class Utils | Method OpenBrowser | Exception desc : " + e.getMessage());
		}
		return driver;
	}

	public static void mouseHoverAction(WebElement mainElement) {
		Actions action = new Actions(driver);
		action.moveToElement(mainElement).build().perform();
	}

	public static String getTestCaseName(String sTestCase) throws Exception {
		String value = sTestCase;
		try {
			int posi = value.indexOf("@");
			value = value.substring(0, posi);
			posi = value.lastIndexOf(".");
			value = value.substring(posi + 1);
			return value;
		} catch (Exception e) {
			Log.error("Class Utils | Method getTestCaseName | Exception desc : " + e.getMessage());
			throw (e);
		}
	}
}

