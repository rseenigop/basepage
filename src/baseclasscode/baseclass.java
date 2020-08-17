package baseclasscode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	
public static WebDriver driver;
		
		public static void getdriver() {
		System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\Welcome\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		public  static void getUrl(String data) {
			driver.get(data);
			driver.manage().window().maximize();
			
		}
		public static void entertxt(WebElement element, String data) {
			element.sendKeys(data);
		}
		public static void btnclick(WebElement element) {
			element.click();
		}
	}

