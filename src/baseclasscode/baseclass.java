package baseclasscode;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseclass {

	
public static WebDriver driver;
		
		public static void getdriver() {
		System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\Welcome\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		

	}

